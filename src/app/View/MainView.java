package app.View;

import app.Util.UserRole;
import app.View.Base.LMSForm;

import javax.swing.*;

public class MainView {

    public MainView(UserRole userRole) {
        this.userRole = userRole;
        setupUI();
    }

    public void setupUI() {
        switch (userRole) {
            case Admin: form = new AdminForm(); break;
            case Librarian: form = new LibrarianForm(); break;
            case Student: form = new StudentForm(); break;
        }
    }

    public LMSForm getForm() {
        return form;
    }

    public JPanel getRootPanel() {
        switch (userRole) {
            case Admin:
                AdminForm adminForm = (AdminForm) form;
                return adminForm.Root;
            case Librarian:
                LibrarianForm librarianForm = (LibrarianForm) form;
                return librarianForm.Root;
            case Student:
                StudentForm studentForm = (StudentForm) form;
                return studentForm.Root;
        }
        return null;
    }

    private UserRole userRole;
    private LMSForm form;

}
