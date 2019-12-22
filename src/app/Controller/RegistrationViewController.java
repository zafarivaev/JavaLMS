package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Account;
import app.Model.Admin;
import app.Util.DatabaseProvider;
import app.Util.UserRole;
import app.View.RegistrationView;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.h2.engine.Database;
import org.h2.engine.User;

import javax.sql.DataSource;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
            view.getEMail().getText().isEmpty()||view.getPasswordField().getPassword().length == 0||
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
                String[] info = new String[5];
                switch (userRole){
                    case Admin:
                        info[0] = view.getNameField().getText();
                        info[1] = view.getLastNameField().getText();
                        if(view.getMaleRadioButton().isSelected()){
                            info[2] = "Male";
                        }
                        else{
                            info[2] = "Female";
                        }
                        info[3] = view.getEMail().getText();
                        info[4] = view.getPasswordField().getPassword().toString();
                        DatabaseProvider.addAdmin(info);
                    case Librarian:
                        info[0] = view.getNameField().getText();
                        info[1] = view.getLastNameField().getText();
                        if(view.getMaleRadioButton().isSelected()){
                            info[2] = "Male";
                        }
                        else{
                            info[2] = "Female";
                        }
                        info[3] = view.getEMail().getText();
                        info[4] = view.getPasswordField().getPassword().toString();
                        DatabaseProvider.addLibrarian(info);
                    case Student:
                        info[0] = view.getNameField().getText();
                        info[1] = view.getLastNameField().getText();
                        if(view.getMaleRadioButton().isSelected()){
                            info[2] = "Male";
                        }
                        else{
                            info[2] = "Female";
                        }
                        info[3] = view.getEMail().getText();
                        info[4] = view.getPasswordField().getPassword().toString();
                        DatabaseProvider.addStudent(info);
                }
               window.getContentPane().removeAll();
               new LogInViewController(userRole);
            }
        });

        view.getBackButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(userRole);
        });

        window.setVisible(true);
    }
}
