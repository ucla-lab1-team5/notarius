/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notarius.controllers;

import notarius.models.Decanato;

/**
 *
 * @author hanumonke
 */
public class PrincipalController {
    PersistenceController persistenceController = new PersistenceController();
    
    public void crearDecanato(Decanato dec) {
        persistenceController.crearDecanato(dec);
    }
}
