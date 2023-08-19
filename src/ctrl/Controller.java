package ctrl;

import models.PrevisionMeteo;
import services.ServiceMeteo;
import views.View;

public class Controller {

    private final View view;
    private final ServiceMeteo serviceMeteo;

    public Controller() {
        view = new View(this);
        serviceMeteo = new ServiceMeteo();
    }

    public void start() {
        view.start();

        view.afficherMessage("Bienvenue dans l'application D400 !");
        view.afficherMessage("Voici la prochaine prévision météréologique :");

        PrevisionMeteo dernierePrevision = serviceMeteo.prochainBulletinMeteo();
        view.afficheDernierePrevision(dernierePrevision);
    }
}
