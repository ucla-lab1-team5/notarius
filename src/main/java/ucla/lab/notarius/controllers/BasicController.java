package ucla.lab.notarius.controllers;

import java.util.ArrayList;

public interface BasicController<T> {
     public void registrar(T entity);
     public void editar(T entity);
     public void eliminar(int entId);
     public ArrayList<T> traerTodos();
     public T encontrar(int etId);

}
