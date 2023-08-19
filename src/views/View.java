package views;

import models.PrevisionMeteo;
import ctrl.Controller;

public class View  {

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void start() {
    }

    public void afficherMessage(String message) {
        System.out.println(message);
    }

    public void afficheDernierePrevision(PrevisionMeteo prevision) {
        afficherMessage(prevision.toString());
    }
}
