package app.Controller.Base;

import app.Util.Helper;
import app.View.Base.MainWindow;

public class ViewController {

    public static MainWindow window = MainWindow.getMainWindow();

    public ViewController() {
        Helper.shared.print(this.toString());
    }

}
