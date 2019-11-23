package app.Controller;

import app.View.LogInView;

class LogInViewController extends ViewController {

    private static LogInView view;
    private static String userRole;

    LogInViewController(String userRole) {
        this.userRole = userRole;
        LogInViewController.view = new LogInView();
        setupUI();
    }

    static void setupUI(){
        window.add(view.getLogInFormMainPanel());
        view.getTitleLabel().setText(userRole);
        window.setVisible(true);
    }


}
