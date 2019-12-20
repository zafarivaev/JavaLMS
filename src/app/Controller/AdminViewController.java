package app.Controller;

import app.Controller.Base.ViewController;
import app.Util.UserRole;
import app.View.AdminView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;

class AdminViewController extends ViewController{

    private static UserRole userRole;
    private static AdminView view;

    AdminViewController() {
        AdminViewController.view = new AdminView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getAdminFormRootPanel());

        view.getLogOutButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Admin);
        });
        String[] columns = {"first", "second", "third","fourth","fifth"};
        String[][] data = {{"one", "two", "three","four","five"}};
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = view.getLibrarianTable();
        table.setModel(model);
        window.setVisible(true);
    }


}
