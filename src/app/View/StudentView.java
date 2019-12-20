package app.View;

import javax.swing.*;

public class StudentView {

    public StudentView() { setupUI(); }

    private void setupUI() { studentForm = new StudentForm();}

    public JPanel getStudentFormRootPanel() { return studentForm.Root; }

    public JButton getLogOutButton(){return studentForm.logOutButton;}

    // Profile getters

    public JTextField getNameField(){return  studentForm.nameField;}

    public JTextField getLastNameField(){return studentForm.lastNameField;}

    public JTextField getGenderField(){return  studentForm.genderField;}

    public JTextField getEmailField(){return studentForm.emailField;}

    public JTextField getPasswordField(){return studentForm.passwordField;}

    public JButton getEditProfileButton(){return studentForm.editProfileButton;}

    public JButton getDeleteProfileButton(){return  studentForm.deleteProfileButton;}

    // Lists

    // Scroll panes

    private static StudentForm studentForm;
}
