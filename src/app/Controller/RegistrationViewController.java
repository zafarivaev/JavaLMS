package app.Controller;

import javax.swing.*;

import app.Util.Helper;
import app.Util.UserRole;
import app.View.RegistrationView;

import java.awt.*;

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
            if(view.getFullName().getText().isEmpty()|| view.getId().getText().isEmpty()||
                    view.getPassword().equals("")|| view.getPasswordCheck().equals("")||
                    view.getMail().getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"You have to fill all fields!!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            else {
                window.getContentPane().removeAll();
                new LogInViewController(userRole);
            }
        });
        view.getTitleLabel().setText(userRoleString);
        window.setVisible(true);
    }
}
