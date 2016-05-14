package ua.kpi.tef;

import ua.kpi.tef.controller.Controller;
import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

/**
 * Created by Denis Drabchuck on 22.04.2016.
 */
public class Main {

    public static void main(String [] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}
