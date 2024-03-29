package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Model.Student;
import app.Util.DatabaseProvider;
import app.Util.UserRole;
import app.View.LogInView;
import app.Util.Helper;

import javax.swing.*;
import java.util.Arrays;

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

        userRoleString = userRole.toString();

        view.getTitleLabel().setText(userRoleString);

        view.getRegistrationButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new RegistrationViewController(userRole);
        });

        view.getLogInButton().addActionListener(actionEvent->{

            String inputEmail = view.getEmailField().getText();
            String inputPassword = String.valueOf(view.getPasswordField().getPassword());

            switch (userRole){
                case Admin:
                    Admin admin = (Admin) DatabaseProvider.retrieveUser(Admin.class,
                            inputEmail,
                            DatabaseProvider.provideAdminDao());

                    if (admin != null){

                    if (inputPassword.equals(admin.password)) {
                        window.getContentPane().removeAll();
                        AdminViewController.admin = admin;
                        new AdminViewController();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid credentials",
                                "Error", JOptionPane.ERROR_MESSAGE);

                        System.out.println("input password: " + inputPassword +
                                " \nactual user's password: " + admin.password);
                    }
                } else {
                        JOptionPane.showMessageDialog(null,"Invalid credentials",
                                "Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case Librarian:
                    Librarian librarian =
                            (Librarian) DatabaseProvider
                                    .retrieveUser(Librarian.class,
                                            inputEmail,
                                            DatabaseProvider.provideLibrarianDao());

                    if (librarian != null) {

                    if (inputPassword.equals(librarian.password)) {
                        window.getContentPane().removeAll();
                        LibrarianViewController.librarian = librarian;
                        new LibrarianViewController();
                    } else {
                        JOptionPane.showMessageDialog(null, "You have to fill all fields!!!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("input password: " + inputPassword +
                                " \nactual user's password: " + librarian.password);
                    }
                } else {
                        JOptionPane.showMessageDialog(null,"Invalid credentials",
                                "Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case Student:
                    Student student =
                            (Student) DatabaseProvider
                                    .retrieveUser(Student.class,
                                            inputEmail,
                                            DatabaseProvider.provideStudentDao());

                    if (student != null) {

                        if (inputPassword.equals(student.password)) {
                            window.getContentPane().removeAll();
                            new StudentViewController();
                        } else {
                            JOptionPane.showMessageDialog(null, "You have to fill all fields!!!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            System.out.println("input password: " + inputPassword +
                                    " \nactual user's password: " + student.password);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Invalid credentials",
                                "Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
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
