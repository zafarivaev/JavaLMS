package app.Controller;

import app.Controller.Base.ViewController;
import app.Util.UserRole;
import app.View.LogInView;
import app.Util.Helper;

class LogInViewController extends ViewController {

    private static LogInView view;
    private static UserRole userRole;

    LogInViewController(UserRole userRole) {
        LogInViewController.userRole = userRole;
        LogInViewController.view = new LogInView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getLogInFormRootPanel());
        String userRoleString = "";

        switch (userRole) {
            case Admin: userRoleString = "Admin"; break;
            case Librarian: userRoleString = "Librarian"; break;
            case Student: userRoleString = "Student"; break;
        }

        view.getTitleLabel().setText(userRoleString);

        view.getRegistrationButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new RegistrationViewController(userRole);
        });

        view.getLogInButton().addActionListener(actionEvent->{
            window.getContentPane().removeAll();
            new MainViewController(userRole);
        });

        view.getBackButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new WelcomeViewController();
        });

        window.setVisible(true);
    }


}
