package app.Controller;
import app.View.AdminView;
import app.Util.UserRole;

import static app.Controller.ViewController.window;

public class AdminViewController extends AdminView {
    private static AdminView wiew;
    private static UserRole userRole;

    AdminViewController (UserRole Admin)
    {
        AdminViewController.userRole=Admin;
        AdminViewController.wiew=new AdminView();
        setupUI();
    }
    public static void setupUI()
    {
        window.add(wiew.getAdminFormRootPanel());
        window.setVisible(true);
    }
}
