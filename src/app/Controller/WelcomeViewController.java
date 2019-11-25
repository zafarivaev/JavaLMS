package app.Controller;

import app.Util.UserRole;
import app.View.WelcomeView;

public class WelcomeViewController extends ViewController {

    private static WelcomeView view;

    public WelcomeViewController() {
        super();
        WelcomeViewController.view = new WelcomeView();
        setupUI();
    }

    private static void setupUI() {
        window.setTitle("Library Management System");
        window.add(view.getRootPanel());
        view.getAdminButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Admin);
        });

        view.getLibrarianButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Librarian);
        });

        view.getStudentButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Student);
        });

        window.setVisible(true);
    }

}
