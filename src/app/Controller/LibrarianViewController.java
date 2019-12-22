package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Librarian;
import app.Model.Student;
import app.Util.DatabaseProvider;
import app.Util.UserRole;
import app.View.LibrarianView;
import app.View.LogInView;

import javax.swing.table.DefaultTableModel;
import java.util.List;

class LibrarianViewController extends ViewController {

    private static LibrarianView view;

    public static Librarian librarian;

    private static DefaultTableModel studentsModel;

    LibrarianViewController(){
        LibrarianViewController.view = new LibrarianView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getLibrarianFormRootPanel());

        showStudents();
        showProfile();

        view.getLogOutButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Librarian);
        });

        window.setVisible(true);
    }

    // SHOW STUDENTS IN THE LIST
    private static void showStudents() {
        studentsModel = new DefaultTableModel(new String[] {"First Name", "Last Name", "Email"}, 0);

        List<Object> students =
                DatabaseProvider.getAll(Student.class, DatabaseProvider.provideStudentDao());

        assert students != null;
        for (Object o : students) {
            Student student = (Student) o;
            System.out.println("Student: " + student.firstName);
            studentsModel.addRow(new Object[]{
                    student.firstName,
                    student.lastName,
                    student.email
            });
        }

        view.getStudentsTable().setModel(studentsModel);
    }

    // SHOW PROFILE
    private static void showProfile() {

        view.getNameField().setText(librarian.firstName);
        view.getLastNameField().setText(librarian.lastName);
        view.getGenderField().setText(librarian.gender.toString());
        view.getEmailField().setText(librarian.email);
        view.getPasswordField().setText(librarian.password);
    }


}
