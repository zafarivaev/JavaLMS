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

    private static LogInForm logInForm;
}
