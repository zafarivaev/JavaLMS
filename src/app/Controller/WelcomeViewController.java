package app.Controller;

import app.Util.Helper;
import app.Util.UserRole;
import app.View.WelcomeView;

public class WelcomeViewController extends ViewController {

    private static WelcomeView view;

    public WelcomeViewController() {
        WelcomeViewController.view = new WelcomeView();
        setupUI();
    }

    private static void setupUI() {
        window.setTitle("Library Management System");
        window.add(view.getRootPanel());
        view.getAdminButton().addActionListener(actionEvent -> {
            Helper.shared.print("Admin clicked");
            LogInViewController logInVC = new LogInViewController(UserRole.Admin);
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.setupUI();
        });

        view.getLibrarianButton().addActionListener(actionEvent -> {
            Helper.shared.print("Librarian clicked");
            LogInViewController logInVC = new LogInViewController(UserRole.Librarian);
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.setupUI();
        });

        view.getStudentButton().addActionListener(actionEvent -> {
            Helper.shared.print("Student clicked");
            LogInViewController logInVC = new LogInViewController(UserRole.Student);
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.setupUI();
        });

        window.setVisible(true);
    }

}
