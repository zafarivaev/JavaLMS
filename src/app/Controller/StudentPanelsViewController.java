package app.Controller;

import app.View.StudentPanelsView;
import app.Util.UserRole;




class StudentPanelsViewController extends ViewController {

    private static StudentPanelsView view;
    private static UserRole userRole;

    StudentPanelsViewController(UserRole userRole)
    {
        StudentPanelsViewController.userRole=userRole;
        StudentPanelsViewController.view=new StudentPanelsView();
        setupUI();
    }

    private static void setupUI()
    {
        window.add(view.getStudentPanelsFormRootPanel());


        window.setVisible(true);
    }



}
