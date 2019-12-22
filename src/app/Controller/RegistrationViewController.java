package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Account;
import app.Util.DatabaseProvider;
import app.Util.UserRole;
import app.View.RegistrationView;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.h2.engine.Database;

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

                String databaseUrl = DatabaseProvider.databaseURL;
                // create a connection source to our database
                ConnectionSource connectionSource = DatabaseProvider.connectionSource();

                // instantiate the dao
                Dao<Account, String> accountDao =
                        DatabaseProvider.provideDao(Account.class);

                // if you need to create the 'accounts' table make this call
                DatabaseProvider.createTableIfNotExists(connectionSource, Account.class);

                switch (userRole){
                    case Admin:

                }
                // create an instance of Account
                Account account = new Account();
                view.getNameField().getText();
                account.setName("Alex");

                // persist the account object to the database
                DatabaseProvider.create(account);

                System.out.println("Account: " + DatabaseProvider.queryForAll());
                ArrayList<Account> accountArrayList = new ArrayList<>();
                accountArrayList = (ArrayList<Account>) DatabaseProvider.queryForAll();
                for(Account obj:accountArrayList){
                    System.out.print(obj.getName());
                    System.out.println(obj.getPassword());
                }

//                window.getContentPane().removeAll();
//                new LogInViewController(userRole);
            }
        });

        view.getBackButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(userRole);
        });

        window.setVisible(true);
    }
}
