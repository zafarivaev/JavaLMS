package app.View;

import javax.swing.*;

public class RegistrationView {

    public RegistrationView(){ setupUI(); }

    private void setupUI(){ registrationForm = new RegistrationForm();}

    public JPanel getRegistrationRootPanel(){ return registrationForm.Root;}

    public JLabel getTitleLabel(){ return registrationForm.titleLabel;}

    public JButton getSaveButton(){return registrationForm.registerButton;}

    public JTextField getNameField(){return  registrationForm.nameField;}

    public JTextField getLastNameField() {return  registrationForm.lastNameField;}

    public JPasswordField getPasswordField() {return registrationForm.passwordField;}

    public JPasswordField getConfirmPassword(){return  registrationForm.confirmPasswordField;}

    public  JTextField getEMailField(){return  registrationForm.emailField;}

    public JButton getBackButton(){return registrationForm.backButton;}

    public JRadioButton getMaleRadioButton(){return registrationForm.maleRadioButton;}

    public JRadioButton getFemaleRadioButton(){return registrationForm.femaleRadioButton;}

    private static RegistrationForm registrationForm;

}
