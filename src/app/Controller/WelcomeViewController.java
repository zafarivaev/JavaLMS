package app.Controller;

import app.Util.Helper;
import app.View.WelcomeView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeViewController extends ViewController {

    private static WelcomeView view;

    public WelcomeViewController() {
        WelcomeViewController.view = new WelcomeView();
        setupUI();
    }

    private static void setupUI() {
        window.setTitle("Library Management System");
        window.add(view.getMainPanel());

        view.getAdminButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Helper.shared.print("Admin clicked");
                LogInViewController logInVC = new LogInViewController();
                window.getContentPane().removeAll();
                window.dispose();
                logInVC.setupUI();
            }
        });

        window.setVisible(true);
    }

}
