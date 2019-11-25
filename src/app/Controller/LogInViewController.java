package app.Controller;

import app.Util.UserRole;
import app.View.LogInView;
import app.Util.Helper;

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
            case Admin: userRoleString = "Admin"; break;
            case Librarian: userRoleString = "Librarian"; break;
            case Student: userRoleString = "Student"; break;
        }
        view.getTitleLabel().setText(userRoleString);

        view.getRegistrationButton().addActionListener(actionEvent -> {
            Helper.shared.print("Registration button clicked");
            window.getContentPane().removeAll();
            new RegistrationViewController(userRole);
        });
        window.setVisible(true);
    }


}
