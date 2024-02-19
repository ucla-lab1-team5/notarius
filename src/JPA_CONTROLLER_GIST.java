/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veres.forum.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import veres.forum.controller.exceptions.NonexistentEntityException;
import veres.forum.controller.exceptions.RollbackFailureException;
import veres.forum.model.Posts;
import veres.forum.model.Threads;
import veres.forum.model.Users;

/**
 *
 * @author Vita
 */
public class PostsJpaController implements Serializable {
    /*
     * 
    public PostsJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
     * 
     */
    
    @Resource
    private UserTransaction utx = null;
    
    @PersistenceUnit (unitName = "ForumPU")
    private EntityManagerFactory emf = null;
    
     public EntityManager getEntityManager() {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("ForumPU");
        }
        return emf.createEntityManager();
    }
    
    private void setUserTransaction() throws NamingException{
        Context context = new InitialContext ();
        
        if(utx == null){
            utx = (UserTransaction) context.lookup ("java:comp/UserTransaction");
         }  
    }

    public void create(Posts posts) throws RollbackFailureException, Exception {
        setUserTransaction();
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Threads thread = posts.getThread();
            if (thread != null) {
                thread = em.getReference(thread.getClass(), thread.getIdThread());
                posts.setThread(thread);
            }
            Users author = posts.getAuthor();
            if (author != null) {
                author = em.getReference(author.getClass(), author.getLogin());
                posts.setAuthor(author);
            }
            em.persist(posts);
            if (thread != null) {
                thread.getPostsList().add(posts);
                thread = em.merge(thread);
            }
            if (author != null) {
                author.getPostsList().add(posts);
                author = em.merge(author);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Posts posts) throws NonexistentEntityException, RollbackFailureException, Exception {
        setUserTransaction();
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Posts persistentPosts = em.find(Posts.class, posts.getIdPost());
            Threads threadOld = persistentPosts.getThread();
            Threads threadNew = posts.getThread();
            Users authorOld = persistentPosts.getAuthor();
            Users authorNew = posts.getAuthor();
            if (threadNew != null) {
                threadNew = em.getReference(threadNew.getClass(), threadNew.getIdThread());
                posts.setThread(threadNew);
            }
            if (authorNew != null) {
                authorNew = em.getReference(authorNew.getClass(), authorNew.getLogin());
                posts.setAuthor(authorNew);
            }
            posts = em.merge(posts);
            if (threadOld != null && !threadOld.equals(threadNew)) {
                threadOld.getPostsList().remove(posts);
                threadOld = em.merge(threadOld);
            }
            if (threadNew != null && !threadNew.equals(threadOld)) {
                threadNew.getPostsList().add(posts);
                threadNew = em.merge(threadNew);
            }
            if (authorOld != null && !authorOld.equals(authorNew)) {
                authorOld.getPostsList().remove(posts);
                authorOld = em.merge(authorOld);
            }
            if (authorNew != null && !authorNew.equals(authorOld)) {
                authorNew.getPostsList().add(posts);
                authorNew = em.merge(authorNew);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = posts.getIdPost();
                if (findPosts(id) == null) {
                    throw new NonexistentEntityException("The posts with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException, RollbackFailureException, Exception {
        setUserTransaction();
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Posts posts;
            try {
                posts = em.getReference(Posts.class, id);
                posts.getIdPost();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The posts with id " + id + " no longer exists.", enfe);
            }
            Threads thread = posts.getThread();
            if (thread != null) {
                thread.getPostsList().remove(posts);
                thread = em.merge(thread);
            }
            Users author = posts.getAuthor();
            if (author != null) {
                author.getPostsList().remove(posts);
                author = em.merge(author);
            }
            em.remove(posts);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Posts> findPostsEntities() {
        return findPostsEntities(true, -1, -1);
    }

    public List<Posts> findPostsEntities(int maxResults, int firstResult) {
        return findPostsEntities(false, maxResults, firstResult);
    }

    private List<Posts> findPostsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Posts.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Posts findPosts(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Posts.class, id);
        } finally {
            em.close();
        }
    }

    public int getPostsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Posts> rt = cq.from(Posts.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

