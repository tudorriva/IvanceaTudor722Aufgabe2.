import Entities.Medikamente;
import Entities.Patienten;
import Repository.Repo;
import Controller.Controller;
import View.View;

public class Main {
    public static void main(String[] args) {
        Repo<Medikamente> medikamenteRepo = new Repo<>();
        Repo<Patienten> patientenRepo = new Repo<>();
        Controller controller = new Controller(medikamenteRepo, patientenRepo);
        View view = new View(controller);
        view.display();
    }
}
