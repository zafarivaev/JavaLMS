package app.Controller;

import app.Controller.Base.ViewController;
import app.Util.UserRole;
import app.View.LibrarianView;
import app.View.LogInView;

class LibrarianViewController extends ViewController {

    private static LibrarianView view;

    LibrarianViewController(){
        LibrarianViewController.view = new LibrarianView();
        setupUI();
    }

    private static void setupUI(){
        window.add(view.getLibrarianFormRootPanel());
        view.getLogOutButton().addActionListener(actionEvent -> {
            window.getContentPane().removeAll();
            new LogInViewController(UserRole.Librarian);
        });

        window.setVisible(true);
    }
}
