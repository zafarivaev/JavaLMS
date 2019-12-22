package app.Controller;

import app.Controller.Base.ViewController;
import app.Model.Admin;
import app.Model.Librarian;
import app.Model.Student;
import app.Util.DatabaseProvider;
import app.Util.Gender;
import app.Util.Helper;
import app.Util.UserRole;
import app.View.AdminView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class AdminViewController extends ViewController{

    private static AdminView view;

    private static DefaultTableModel librariansModel;
    private static DefaultTableModel studentsModel;

    AdminViewController() {
        AdminViewController.view = new AdminView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getAdminFormRootPanel());

        view.getLogOutButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Admin);
        });



        showLibrarians();
        showStudents();

       view.getAddLibrarianButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               Helper.shared.print("Add in admin librarians");

//               // Mock librarian
//               Librarian mockLibrarian = new Librarian("Zafar",
//                       "Ivaev",
//                       Gender.male,
//                       "z.ivaev@mail.ru",
//                       "pass123");
//
//
//               librariansModel.addRow(new Object[]{
//                       mockLibrarian.firstName,
//                       mockLibrarian.lastName});
           }
       });
       window.setVisible(true);
    }

    // SHOW LIBRARIANS IN THE LIST
    private static void showLibrarians() {
        librariansModel = new DefaultTableModel(new String[] {"First Name", "Last Name", "Email"}, 0);

        List<Object> librarians = DatabaseProvider.getAll(Librarian.class);

        assert librarians != null;
        for (Object o : librarians) {
            Librarian librarian = (Librarian) o;
            librariansModel.addRow(new Object[]{
                    librarian.firstName,
                    librarian.lastName,
                    librarian.email
            });
        }

        view.getLibrarianTable().setModel(librariansModel);
    }

    // SHOW STUDENTS IN THE LIST
    private static void showStudents() {
        studentsModel = new DefaultTableModel(new String[] {"First Name", "Last Name", "Email"}, 0);

        List<Object> students = DatabaseProvider.getAll(Student.class);

        assert students != null;
        for (Object o : students) {
            Student student = (Student) o;
            librariansModel.addRow(new Object[]{
                    student.firstName,
                    student.lastName,
                    student.email
            });
        }

        view.getLibrarianTable().setModel(studentsModel);
    }

}
