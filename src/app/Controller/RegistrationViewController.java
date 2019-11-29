package app.Controller;

import app.Util.Helper;
import app.Util.UserRole;
import app.View.RegistrationView;
import javax.swing.JOptionPane;

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
            Helper.shared.print("Register button clicked");
            if(view.getNameField().getText().isEmpty()||view.getLastNameField().getText().isEmpty()||
            view.getEMail().getText().isEmpty()||view.getPassword().toString().isEmpty()||
                    view.getConfirmPassword().toString().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"You have to fill all fields!!!",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else {
                window.getContentPane().removeAll();
                new LogInViewController(userRole);
            }
        });
        window.setVisible(true);
    }
}
