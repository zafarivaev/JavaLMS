package app.Controller;

import app.Util.UserRole;
import app.View.LogInView;

class LogInViewController extends ViewController {

    private static LogInView view;
    private static UserRole userRole;

    LogInViewController(UserRole userRole) {
        this.userRole = userRole;
        LogInViewController.view = new LogInView();
        setupUI();
    }

    static void setupUI(){
        window.add(view.getLogInFormRootPanel());
        String userRoleString = "";
        switch (userRole) {
            case Admin: userRoleString = "Admin";
            case Librarian: userRoleString = "Librarian";
            case Student: userRoleString = "Student";
        }
        view.getTitleLabel().setText(userRoleString);
        window.setVisible(true);
    }


}
