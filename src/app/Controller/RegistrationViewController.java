package app.Controller;

import app.Util.Helper;
import app.Util.UserRole;
import app.View.RegistrationView;

class RegistrationViewController extends ViewController {

    private static RegistrationView view;
    private static UserRole userRole;

    RegistrationViewController(UserRole userRole){
        RegistrationViewController.userRole = userRole;
        RegistrationViewController.view = new RegistrationView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getRegistrationRootPanel());
        view.getSaveButton().addActionListener(actionEvent -> {
            Helper.shared.print("Save button clicked");
            window.getContentPane().removeAll();
            new LogInViewController(userRole);
        });
        window.setVisible(true);
    }
}
