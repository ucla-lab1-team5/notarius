package ucla.lab.notarius.views;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
   private AdminGestionCarreraView adminCarreraView;
   private AdminGestionDecanatoView adminDecanatoView;
   private AdminGestionMateriaView adminMateriaView;
   private AdminGestionSeccionView adminSeccionView;
   private AdminGestionSemestreView adminSemestreView;
   private AdminGestionUsuarioView adminUsuarioView;
   private MenuEstudianteView MenuEstudianteView;
   private ProfGestionCalificacionesView profGestionMateriaView;
    
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

    public void initIndexEstudianteView() {
        this.getContentPane().removeAll();
        this.MenuEstudianteView = new MenuEstudianteView();
        this.getContentPane().add(this.MenuEstudianteView);
    }

    public void initProfGestionMateriaView() {
        this.getContentPane().removeAll();
        this.profGestionMateriaView = new ProfGestionCalificacionesView();
        this.getContentPane().add(this.profGestionMateriaView);
    }

}
