package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Util.Gender;
import app.Util.Helper;
import app.Util.UserRole;
import app.View.AdminView;

import javax.swing.table.DefaultTableModel;
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
               Helper.shared.print("Add in admin librarians");

               // Mock librarian
               Librarian mockLibrarian = new Librarian("Zafar",
                       "Ivaev",
                       Gender.male,
                       "z.ivaev@mail.ru",
                       "pass123");


               librariansModel.addRow(new Object[]{
                       mockLibrarian.firstName,
                       mockLibrarian.lastName});
           }
       });
       window.setVisible(true);
    }

}
