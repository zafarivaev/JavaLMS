package app.View;
import javax.swing.*;

public class AdminView {

    public AdminView(){setupUI();}

    public static void setupUI(){ AdminForm=new AdminForm(); }

    public JPanel getAdminFormRootPanel(){ return AdminForm.Root; }

    public JLabel getTitleLabel(){ return AdminForm.titleLabel;}

    public JButton getLogOutButton(){ return AdminForm.logOutButton; }

    private static app.View.AdminForm AdminForm;



}
