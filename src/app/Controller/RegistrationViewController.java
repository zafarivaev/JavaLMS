package app.Controller;

import app.Util.Helper;
import app.Util.UserRole;
import app.View.RegistrationView;

public class RegistrationViewController extends ViewController {

    private static RegistrationView view;
    private static UserRole userRole;

    RegistrationViewController(UserRole userRole){
        this.userRole = userRole;
        RegistrationViewController.view = new RegistrationView();
        setupUI();
    }

    static void setupUI(){
        window.add(view.getRegistrationRootPanel());
        String userRoleString = "";
        switch (userRole){
            case Admin:userRoleString = "Admin"; break;
            case Student:userRoleString = "Student"; break;
            case Librarian:userRoleString = "Librarian"; break;
        }
        view.getSaveButton().addActionListener(actionEvent -> {
            Helper.shared.print("Save button clicked");
            window.getContentPane().removeAll();
            new LogInViewController(userRole);
        });
        view.getTitleLabel().setText(userRoleString);
        window.setVisible(true);
    }
}
