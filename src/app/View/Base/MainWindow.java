package app.View.Base;

import app.Util.Helper;

import java.awt.*;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

    private static MainWindow window = new MainWindow();

    private MainWindow() {
        Helper.shared.print(this.toString());
        Helper.shared.setAppIcon(this);
        Dimension screenSize = Helper.shared.getScreenSize();
        this.setSize((int)(screenSize.width * 0.5), (int)(screenSize.height * 0.5));
        this.setLocation((int)(screenSize.width * 0.25), (int)(screenSize.height * 0.25));
    }

    public static MainWindow getMainWindow() {
        return window;
    }
}