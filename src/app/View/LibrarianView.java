package app.View;

import javax.swing.*;
import java.awt.*;

public class LibrarianView {

    public LibrarianView() { setupUI(); }

    private void setupUI() { librarianForm = new LibrarianForm(); }

    public JPanel getLibrarianFormRootPanel() { return librarianForm.Root; }

    public JButton getLogOutButton(){return librarianForm.logOutButton;}

    // Student getters

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

    public JButton getAddBookButton(){return librarianForm.addBookButton;}

    public JButton getEditBookButton(){return librarianForm.editBookButton;}

    public JButton getDeleteBookButton(){return librarianForm.deleteBookButton;}

    public JTable getStudentsTable() { return librarianForm.studentsTable; }

    private static LibrarianForm librarianForm;
}
