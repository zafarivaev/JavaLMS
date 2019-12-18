package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Model.Student;
import app.Util.Gender;
import app.Util.Helper;
import app.Util.UserRole;
import app.View.AdminForm;
import app.View.LibrarianForm;
import app.View.MainView;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class MainViewController extends ViewController {

    private static MainView view;
    private static UserRole userRole;

    MainViewController(UserRole userRole) {
        super();
        MainViewController.userRole = userRole;
        MainViewController.view = new MainView(userRole);
        setupUI();
    }

    private static void setupUI() {
        window.add(view.getRootPanel());

        view.getForm().getLogOutButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                window.getContentPane().removeAll();
                new LogInViewController(userRole);
            }
        });

        if (view.getForm().getClass().equals(AdminForm.class)) {
            
            List<Student> studentModels = new ArrayList<>();
            studentModels.add(new Student(
                    "Zafar", 
                    "Ivaev",
                    Gender.male,
                    "z.ivaev@mail.ru",
                    "123"));

            studentModels.add(new Student(
                    "Zafar",
                    "Ivaev",
                    Gender.male,
                    "z.ivaev@mail.ru",
                    "123"));


            AdminForm.shared.provideDataForStudentsList(studentModels.toArray());

            // Prints 2
            System.out.println(AdminForm.shared.getStudentsList().getModel().getSize());

        } else if (view.getForm().getClass().equals(LibrarianForm.class)) {

        } else {

        }


        window.setVisible(true);
    }
}
