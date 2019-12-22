package app.View;

import javax.swing.*;

public class LogInView {

    public LogInView() { setupUI(); }

    private void setupUI() {
        logInForm = new LogInForm();
    }

    public JPanel getLogInFormRootPanel() { return logInForm.Root; }

    public JLabel getTitleLabel() { return logInForm.titleLabel; }

    public JButton getRegistrationButton(){return  logInForm.registerButton;}

    public JButton getLogInButton(){return logInForm.logInButton;}

    public JButton getBackButton(){return logInForm.backButton;}

    public JTextField getEmailField() { return logInForm.emailField; }

    public JPasswordField getPasswordField() { return logInForm.passwordField; }

    private static LogInForm logInForm;
}
