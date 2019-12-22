package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Model.Student;
import app.Util.DatabaseProvider;
import app.Util.Gender;
import app.Util.UserRole;
import app.View.RegistrationView;
import org.h2.engine.Database;

import javax.swing.*;
import javax.xml.crypto.Data;
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

                        Admin newAdmin = new Admin(
                                firstName,
                                lastName,
                                gender,
                                email,
                        password);

                        DatabaseProvider.add(newAdmin, DatabaseProvider.provideAdminDao());

                        window.getContentPane().removeAll();
                        AdminViewController.admin = newAdmin;
                        new AdminViewController();
                        break;
                    case Librarian:

                        Librarian newLibrarian = new Librarian(
                                firstName,
                                lastName,
                                gender,
                                email,
                                password);

                        DatabaseProvider.add(newLibrarian, DatabaseProvider.provideLibrarianDao());

                        window.getContentPane().removeAll();
                        LibrarianViewController.librarian = newLibrarian;
                        new LibrarianViewController();
                        break;
                    case Student:
                        DatabaseProvider.add(new Student(
                                firstName,
                                lastName,
                                gender,
                                email,
                                password), DatabaseProvider.provideStudentDao());

                        window.getContentPane().removeAll();
                        new StudentViewController();
                        break;
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
