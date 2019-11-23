package app.Controller;

import app.Util.Helper;
import app.View.WelcomeView;

import javax.swing.*;

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
            LogInViewController logInVC = new LogInViewController("Admin");
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.setupUI();
        });

        view.getLibrarianButton().addActionListener(actionEvent -> {
            Helper.shared.print("Librarian clicked");
            LogInViewController logInVC = new LogInViewController("Librarian");
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.setupUI();
        });

        view.getStudentButton().addActionListener(actionEvent -> {
            Helper.shared.print("Student clicked");
            LogInViewController logInVC = new LogInViewController("Student");
            window.getContentPane().removeAll();
            window.dispose();
            logInVC.setupUI();
        });

        window.setVisible(true);
    }

}
