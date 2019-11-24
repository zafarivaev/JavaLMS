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
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Admin);
        });

        view.getLibrarianButton().addActionListener(actionEvent -> {
            Helper.shared.print("Librarian clicked");
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Librarian);
        });

        view.getStudentButton().addActionListener(actionEvent -> {
            Helper.shared.print("Student clicked");
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Student);
        });

        window.setVisible(true);
    }

}
