package ucla.lab.notarius.controllers;

import java.awt.event.*;

import ucla.lab.notarius.views.Login;
import ucla.lab.notarius.views.AdminGestionCarreraView;


public class LoginController {
    private Login view; 

    LoginController(Login view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.setLocationRelativeTo(null);

    }
}


