package app.View;

import javax.swing.*;
import java.awt.*;

public class LibrarianView {

    public LibrarianView() { setupUI(); }

    private void setupUI() { librarianForm = new LibrarianForm(); }

    public JPanel getAdminFormRootPanel() { return librarianForm.Root; }

    public JButton getLogOutButton(){return librarianForm.logOutButton;}

    // Student getters

    public JButton getAddStudentButton(){return  librarianForm.addStudentButton;}

    public JButton getEditStudentButton(){return librarianForm.editStudentButton;}

    public JButton getDeleteStudentButton(){return librarianForm.deleteStudentButton;}

    // Profile getters

    public JTextField getNameField(){return  librarianForm.nameField;}

    public JTextField getLastNameField(){return librarianForm.lastNameField;}

    public JTextField getGenderField(){return  librarianForm.genderField;}

    public JTextField getEmailField(){return librarianForm.emailField;}

    public JTextField getPasswordField(){return librarianForm.passwordField;}

    public JButton getEditProfileButton(){return librarianForm.editProfileButton;}

    public JButton getDeleteProfileButton(){return  librarianForm.deleteProfileButton;}

    // Lists

    private static LibrarianForm librarianForm;
}
