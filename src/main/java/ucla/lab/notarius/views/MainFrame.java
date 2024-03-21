package ucla.lab.notarius.views;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
   
   private GestionDecanatoView adminDecanatoView;
   
    public MainFrame() {
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

    }

    public void initAdminGestionDecanatoView() {
        this.getContentPane().removeAll();
        this.adminDecanatoView = new GestionDecanatoView();
        this.getContentPane().add(this.adminDecanatoView);
    }


}
