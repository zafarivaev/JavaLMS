package app.View;

import app.Util.Helper;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        Dimension screenSize = Helper.shared.getScreenSize();
        this.setSize((int)(screenSize.width * 0.5), (int)(screenSize.height * 0.5));
        this.setLocation((int)(screenSize.width * 0.25), (int)(screenSize.height * 0.25));
    }

}