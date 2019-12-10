package app.Controller;

import app.Controller.Base.ViewController;
import app.Util.UserRole;
import app.View.MainView;


public class MainViewController extends ViewController {

    private static MainView view;
    private static UserRole userRole;

    MainViewController(UserRole userRole) {
        super();
        MainViewController.userRole = userRole;
        MainViewController.view = new MainView(userRole);
        setupUI();
    }

    public static void setupUI() {
        window.add(view.getRootPanel());
        window.setVisible(true);
    }
}
