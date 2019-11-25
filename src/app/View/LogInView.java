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

    private static LogInForm logInForm;
}
