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
            switch (userRole){
                case Admin:
                    new AdminViewController();break;
                case Librarian:
                    new LibrarianViewController();break;
                case Student:
                    new StudentViewController();break;
                default:
            }
        });

        view.getBackButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new WelcomeViewController();
        });

        window.setVisible(true);
    }


}
