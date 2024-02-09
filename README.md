# MVC_SOUT_D400_JDK17LTS
## C'est quoi ?
C'est un template Visual Studio Code pour des projets et/ou exercices Java dès le D400 :
- Basé sur JDK-17-LTS
- Utilise le pattern MVC décidé en GT-DEV 2023
- Pas d'utilisation d'interfaces (elles sont vues au module ~~226a~~ 320)
- L'ihm utilisée est la console

**-> Utile dès le module D400 quand on veut une ihm super-simple**

## Vue d'ensemble UML du projet
### Détail des classes du projet - avec Entreprise Architect

<img src="uml/MVC_SOUT_D400_JDK17LTS.png" />

### Détail des classes du projet - avec `mermaid`
Voici une vue d'ensemble du contenu de ce projet sous forme de diagramme UML en utilisant la notation `mermaid` (qui génère des diagrammes à la volée, dynamiquement).

### Les packages utilisés
```mermaid
classDiagram
namespace app {
    class Application
}
namespace ctrl {
    class Controller
}
namespace views {
    class View
}
namespace models {
    class PrevisionMeteo
}
namespace services {
    class ServiceMeteo
}
```
### Détail des classes du projet - toutes les classes sur un schéma
```mermaid
classDiagram

    class Application {
        +main(String[] args)$ void
    }

    class Controller {
        -View view
        -ServiceMeteo serviceMeteo
        Controller()
        +start() void
    }

    class View {
        -Controller controller
        -TextField textFieldPrevisionMeteo
        -ListView<Voiture> listViewVoituresDisponibles
        -ListView<Voiture> listViewVoituresLouees
        View(Controller controller)
        +start() void
        +afficherMessage(String message) void
        +afficheDernierePrevision(PrevisionMeteo prevision) void
    }

    class PrevisionMeteo {
        -String prevision
        PrevisionMeteo( String prevision )
        +getPrevision() String
    }

    class ServiceMeteo {
        ServiceMeteo()
        +prochainBulletinMeteo() PrevisionMeteo
    }
    
    Controller o--> "1" ServiceMeteo : serviceMeteo
    Controller o--> "1" View : view
    View o--> "1" Controller : controller

    ServiceMeteo ..> PrevisionMeteo : "utilise"
    Application ..> Controller : "utilise"


```
