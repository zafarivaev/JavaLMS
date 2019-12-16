package app.Controller;

import app.Controller.Base.ViewController;
import app.Util.Helper;
import app.Util.UserRole;
import app.View.MainView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

        view.getForm().getLogOutButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                window.getContentPane().removeAll();
                new LogInViewController(userRole);
            }
        });

        window.setVisible(true);
    }
}
