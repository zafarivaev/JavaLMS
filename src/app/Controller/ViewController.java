package app.Controller;

import app.Util.Helper;
import app.View.MainWindow;

public class ViewController extends MainWindow {

    static MainWindow window = new MainWindow();

    ViewController() {
        Helper.shared.print(window.toString());
    }

}
