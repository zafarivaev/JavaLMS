package app.Controller;

import app.Util.Helper;
import app.View.WelcomeView;

public class WelcomeViewController extends ViewController {

    private static WelcomeView view;

    public WelcomeViewController() {
        WelcomeViewController.view = new WelcomeView();
        setupUI();
    }
//Test
    private static void setupUI() {
        window.setTitle("Library Management System");
        window.add(view.getMainPanel());

        view.getAdminButton().addActionListener(actionEvent -> {
            Helper.shared.print("Admin clicked");
            LogInViewController logInVC = new LogInViewController();
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.userRole = "Admin";
            logInVC.setupUI();
        });

        view.getLibrarianButton().addActionListener(actionEvent -> {
            Helper.shared.print("Librarian clicked");
            LogInViewController logInVC = new LogInViewController();
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.userRole = "Librarian";
            logInVC.setupUI();
        });

        view.getStudentButton().addActionListener(actionEvent -> {
            Helper.shared.print("Student clicked");
            LogInViewController logInVC = new LogInViewController();
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.userRole = "Student";
            logInVC.setupUI();
        });

        window.setVisible(true);
    }

}
