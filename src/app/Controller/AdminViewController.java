package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Util.UserRole;
import app.View.AdminView;

class AdminViewController extends ViewController{

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
       /* ArrayList<String[5])> temp = new Vector<String>;
        temp.add({"Alex","Frost","Male","frost@mail.ru","1fsdfgd"});
        String[] columns = {"Name", "Last Name", "Gender","Email","Password"};
        String[][] data = {{"one", "two", "three","four","five"}.};
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = view.getLibrarianTable();
        table.setModel(model);
        window.setVisible(true);*/
       window.setVisible(true);
    }

}
