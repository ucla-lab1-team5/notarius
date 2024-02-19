package notarius.controllers;

import notarius.models.Decanato;

/**
 *
 * @author hanumonke
 */
public class PersistenceController {
    DecanatoJpaController decanatoController = new DecanatoJpaController();

    void crearDecanato(Decanato dec) {
       decanatoController.create(dec);
    }
}
