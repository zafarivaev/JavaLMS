package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Model.Student;
import app.Util.DatabaseProvider;
import app.Util.Gender;
import app.Util.UserRole;
import app.View.RegistrationView;

import javax.swing.*;
import java.util.Arrays;



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
            if(view.getNameField().getText().isEmpty()||view.getLastNameField().getText().isEmpty()||
            view.getEMailField().getText().isEmpty()||view.getPasswordField().getPassword().length == 0||
                    view.getConfirmPassword().getPassword().length == 0)
            {
                JOptionPane.showMessageDialog(null,"You have to fill all fields!!!",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(!Arrays.equals(view.getPasswordField().getPassword(),view.getConfirmPassword().getPassword())){
                JOptionPane.showMessageDialog(null,"Your password should be the same",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else {

                // All properties from the form
                String firstName = view.getNameField().getText();
                String lastName = view.getLastNameField().getText();
                Gender gender;

                if (view.getMaleRadioButton().isSelected()) {
                    gender = Gender.male;
                } else {
                    gender = Gender.female;
                }

                String email = view.getEMailField().getText();
                String password = String.valueOf(view.getPasswordField().getPassword());


                switch (userRole){
                    case Admin:
                        DatabaseProvider.add(new Admin(
                                firstName,
                                lastName,
                                gender,
                                email,
                                password));

                        window.getContentPane().removeAll();
                        new AdminViewController();

                    case Librarian:
                        DatabaseProvider.add(new Librarian(
                                firstName,
                                lastName,
                                gender,
                                email,
                                password));

                        window.getContentPane().removeAll();
                        new LibrarianViewController();

                    case Student:
                        DatabaseProvider.add(new Student(
                                firstName,
                                lastName,
                                gender,
                                email,
                                password));

                        window.getContentPane().removeAll();
                        new StudentViewController();
                }

            }
        });

        view.getBackButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(userRole);
        });

        window.setVisible(true);
    }
}
