package app.Controller;

import app.Controller.Base.ViewController;
import app.Util.UserRole;
import app.View.LibrarianView;
import app.View.LogInView;
import app.View.StudentView;

class StudentViewController extends ViewController {

    private static StudentView view;

    StudentViewController(){
        StudentViewController.view = new StudentView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getStudentFormRootPanel());
        view.getLogOutButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Student);
        });

        window.setVisible(true);
    }
}
