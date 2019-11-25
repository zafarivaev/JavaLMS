package app.View;

import javax.swing.*;

public class RegistrationView {

    public RegistrationView(){setupUI();}

    private void setupUI(){ registrationForm = new RegistrationForm();}

    public JPanel getRegistrationRootPanel(){ return registrationForm.Root;}

    public JLabel getTitleLabel(){ return  registrationForm.titleLabel;}

    public JButton getSaveButton(){return  registrationForm.saveButton;}

    public JTextField getFullName(){return  registrationForm.fullNameTextField;}

    private static RegistrationForm registrationForm;

}
