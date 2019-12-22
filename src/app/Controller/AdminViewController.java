package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Util.Gender;
import app.Util.Helper;
import app.Util.UserRole;
import app.View.AdminView;
import app.View.Base.MainWindow;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdminViewController extends ViewController{

    private static AdminView view;
    private static DefaultTableModel librariansModel;


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


        librariansModel = new DefaultTableModel(new String[] {"First Name", "Last Name"}, 0);
        view.getLibrarianTable().setModel(librariansModel);

       view.getAddLibrarianButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               JFrame newWindow = new JFrame();
               Dimension screenSize = Helper.shared.getScreenSize();
               newWindow.setSize((int)(screenSize.width*0.3),(int)(screenSize.height*0.3));
               newWindow.setLocation((int)(screenSize.width*0.25),(int)(screenSize.height*0.25));
               newWindow.setTitle("Update");
               newWindow.add(view.getRegistrationPanel());
               newWindow.setVisible(true);
           }
       });
       window.setVisible(true);
    }

}
