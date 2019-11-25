package app.View;

import javax.swing.*;

public class RegistrationView {

    public RegistrationView(){setupUI();}

    private void setupUI(){ registrationForm = new RegistrationForm();}

    public JPanel getRegistrationRootPanel(){ return registrationForm.Root;}

    public JLabel getTitleLabel(){ return registrationForm.titleLabel;}

    public JButton getSaveButton(){return registrationForm.registerButton;}

    public JTextField getNameField(){return  registrationForm.nameField;}

    public JTextField getLastNameField(){return  registrationForm.lastNameField;}

    public JPasswordField getPassword(){return  registrationForm.passwordField;}

    public JPasswordField getConfirmPassword(){return  registrationForm.confirmPasswordField;}

    public  JTextField getEMail(){return  registrationForm.emailField;}

    private static RegistrationForm registrationForm;

}
