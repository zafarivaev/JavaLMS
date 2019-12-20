package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Account;
import app.Util.UserRole;
import app.View.RegistrationView;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import javax.sql.DataSource;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.sql.SQLException;
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

                String databaseUrl = "jdbc:h2:mem:account";
                // create a connection source to our database
                ConnectionSource connectionSource =
                        null;
                try {
                    connectionSource = new JdbcConnectionSource(databaseUrl);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // instantiate the dao
                Dao<Account, String> accountDao = null;
                try {
                    assert connectionSource != null;
                    accountDao =
                            DaoManager.createDao(connectionSource, Account.class);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // if you need to create the 'accounts' table make this call
                try {
                    TableUtils.createTable(connectionSource, Account.class);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // create an instance of Account
                Account account = new Account();
                account.setName("Jim Coakley");

                // persist the account object to the database
                try {
                    assert accountDao != null;
                    accountDao.create(account);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // retrieve the account from the database by its id field (name)
                Account account2 = null;
                try {
                    account2 = accountDao.queryForId("Jim Coakley");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println("Account: " + account2.getName());

                // close the connection source
                try {
                    connectionSource.close();
                } catch (IOException e) {
                    e.printStackTrace();
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
