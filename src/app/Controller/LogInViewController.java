package app.Controller;

import app.View.LogInForm;
import app.View.LogInView;

public class LogInViewController extends ViewController {

    private static LogInView view;

    LogInViewController() {
        LogInViewController.view = new LogInView();
        setupUI();
    }

    public static void setupUI(){
        window.add(view.getLogInFormMainPanel());
        window.setVisible(true);
    }



}
