package app.View;

import javax.swing.*;

public class RegistrationView {

    public RegistrationView(){setupUI();}

    private void setupUI(){ registrationForm = new RegistrationForm();}

    public JPanel getRegistrationRootPanel(){ return registrationForm.Root;}

    public JLabel getTitleLabel(){ return registrationForm.titleLabel;}

    public JButton getSaveButton(){return registrationForm.registerButton;}

    private static RegistrationForm registrationForm;

}
