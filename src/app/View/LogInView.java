package app.View;

import javax.swing.*;

public class LogInView {

    public LogInView() {
        setupUI();
    }

    private void setupUI() {
        logInForm = new LogInForm();
    }

    public LogInForm getLogInForm() {
        return logInForm;
    }

    public JPanel getLogInFormMainPanel() {
        return logInForm.Main;
    }

    //Properties
    private static LogInForm logInForm;
}
