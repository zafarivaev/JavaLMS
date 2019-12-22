package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Util.DatabaseProvider;
import app.Util.UserRole;
import app.View.WelcomeView;
import org.h2.engine.Database;

import javax.xml.crypto.Data;

public class WelcomeViewController extends ViewController {

    private static WelcomeView view;

    public WelcomeViewController() {
        super();
        WelcomeViewController.view = new WelcomeView();
        setupUI();

        // TEST: SHOW ALL DATABASE OBJECTS

        //print all admins
        DatabaseProvider.getAll(Admin.class, DatabaseProvider.provideAdminDao());
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
