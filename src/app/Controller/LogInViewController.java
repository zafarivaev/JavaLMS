package app.Controller;

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
            case Admin: {userRoleString = "Admin";
            new AdminViewController(userRole);
            break;}
            case Librarian: userRoleString = "Librarian"; break;
            case Student: {userRoleString = "Student";
                new StudentPanelsViewController(userRole);
                break;}
        }
        view.getTitleLabel().setText(userRoleString);

        view.getRegistrationButton().addActionListener(actionEvent -> {
            Helper.shared.print("Registration button clicked");
            window.getContentPane().removeAll();
            new RegistrationViewController(userRole);
        });
        view.getLogInButton().addActionListener(actionEvent->{
            Helper.shared.print("log in confirmed");
            window.getContentPane().removeAll();

        });


        window.setVisible(true);
    }


}
