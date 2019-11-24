package app.View;

import javax.swing.*;

public class WelcomeView {

    public WelcomeView() {
        setupUI();
    }

    private void setupUI() {
        welcomeForm = new WelcomeForm();
    }

    public JPanel getRootPanel() {
        return welcomeForm.Root;
    }

    public JButton getAdminButton() { return welcomeForm.adminButton; }

    public JButton getLibrarianButton() { return welcomeForm.librarianButton; }

    public JButton getStudentButton() {  return welcomeForm.studentButton; }

    private static WelcomeForm welcomeForm;
}
