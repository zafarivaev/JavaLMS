package app.View;

import javax.swing.*;

public class RegistrationView {

    public RegistrationView(){setupUI();}

    private void setupUI(){ registrationForm = new RegistrationForm();}

    public JPanel getRegistrationRootPanel(){ return registrationForm.Root;}

    public JLabel getTitleLabel(){ return registrationForm.titleLabel;}

    public JButton getSaveButton(){return registrationForm.registerButton;}

    public JTextField getId(){return  registrationForm.idTextField;}

    public JPasswordField getPassword(){return  registrationForm.passwordTextField;}

    public JPasswordField getPasswordCheck(){return  registrationForm.passwordTextFieldCheck;}

    public  JTextField getMail(){return  registrationForm.mailTextField;}

    private static RegistrationForm registrationForm;

}
