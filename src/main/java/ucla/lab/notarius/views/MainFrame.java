package ucla.lab.notarius.views;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
   private AdminGestionCarreraView adminCarreraView;
   private AdminGestionDecanatoView adminDecanatoView;
   private AdminGestionMateriaView adminMateriaView;
   private AdminGestionSeccionView adminSeccionView;
   private AdminGestionSemestreView adminSemestreView;
   private AdminGestionUsuarioView adminUsuarioView;
//    private IndexEstudianteView indexEstudiante;
   private PerfilView perfilView;
   private ProfCalificarStudentView profCalificarStudentView;
   private ProfGestionMateriaView profGestionMateriaView;
    
    public MainFrame() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

    }

    public void initAdminGestionCarreraView() {
        this.getContentPane().removeAll();
        this.adminCarreraView = new AdminGestionCarreraView();
        this.getContentPane().add(this.adminCarreraView);

    }

    public void initAdminGestionDecanatoView() {
        this.getContentPane().removeAll();
        this.adminDecanatoView = new AdminGestionDecanatoView();
        this.getContentPane().add(this.adminDecanatoView);
    }

    public void initAdminGestionMateriaView() {
        this.getContentPane().removeAll();
        this.adminMateriaView = new AdminGestionMateriaView();
        this.getContentPane().add(this.adminMateriaView);
    }

    public void initAdminGestionSeccionView() {
        this.getContentPane().removeAll();
        this.adminSeccionView = new AdminGestionSeccionView();
        this.getContentPane().add(this.adminSeccionView);
    }

    public void initAdminGestionSemestreView() {
        this.getContentPane().removeAll();
        this.adminSemestreView = new AdminGestionSemestreView();
        this.getContentPane().add(this.adminSemestreView);
    }

    public void initAdminGestionUsuarioView() {
        this.getContentPane().removeAll();
        this.adminUsuarioView = new AdminGestionUsuarioView();
        this.getContentPane().add(this.adminUsuarioView);
    }

    // public void initIndexEstudianteView() {
    //     this.getContentPane().removeAll();
    //     this.indexEstudiante = new IndexEstudianteView();
    //     this.getContentPane().add(this.indexEstudiante);
    // }

    public void initPerfilView() {
        this.getContentPane().removeAll();
        this.perfilView = new PerfilView();
        this.getContentPane().add(this.perfilView);
    }

    public void initProfCalificarStudentView() {
        this.getContentPane().removeAll();
        this.profCalificarStudentView = new ProfCalificarStudentView();
        this.getContentPane().add(this.profCalificarStudentView);
    }

    public void initProfGestionMateriaView() {
        this.getContentPane().removeAll();
        this.profGestionMateriaView = new ProfGestionMateriaView();
        this.getContentPane().add(this.profGestionMateriaView);
    }

}
