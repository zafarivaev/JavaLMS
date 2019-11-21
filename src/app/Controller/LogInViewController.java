package app.Controller;

import app.View.LogInView;

class LogInViewController extends ViewController {

    private static LogInView view;
    static String userRole;

    LogInViewController() {
        LogInViewController.view = new LogInView();
        setupUI();
    }

    static void setupUI(){
        window.add(view.getLogInFormMainPanel());
        view.getTitleLabel().setText(userRole);
        window.setVisible(true);
    }


}
