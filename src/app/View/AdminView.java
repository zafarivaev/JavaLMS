package app.View;

import javax.swing.*;

public class AdminView {

    public AdminView() { setupUI(); }

    private void setupUI() { adminForm = new AdminForm(); }

    public JPanel getAdminFormRootPanel() { return adminForm.Root; }

    public JButton getLogOutButton(){return adminForm.logOutButton;}

    // Librarian getters

    public JButton getAddLibrarianButton(){return adminForm.addLibrarianButton;}

    public JButton getEditLibrarianButton(){return  adminForm.editLibrarianButton;}

    public JButton getDeleteLibrarianButton(){return adminForm.deleteLibrarianButton;}

    // Student getters

    public JButton getAddStudentButton(){return  adminForm.addStudentButton;}

    public JButton getEditStudentButton(){return adminForm.editStudentButton;}

    public JButton getDeleteStudentButton(){return adminForm.deleteStudentButton;}

    // Profile getters

    public JTextField getNameField(){return  adminForm.nameField;}

    public JTextField getLastNameField(){return adminForm.lastNameField;}

    public JTextField getGenderField(){return  adminForm.genderField;}

    public JTextField getEmailField(){return adminForm.emailField;}

    public JTextField getPasswordField(){return adminForm.passwordField;}

    public JButton getEditProfileButton(){return adminForm.editProfileButton;}

    public JButton getDeleteProfileButton(){return  adminForm.deleteProfileButton;}

    // Tables

    public JTable getLibrariansTable(){return adminForm.librariansTable;}

    public JTable getStudentsTable() { return adminForm.studentsTable;}


    // Scroll panes

    public JScrollPane getLibrarianScrollPane(){return adminForm.LibrarianScrollPane;}

    private static AdminForm adminForm;
}
