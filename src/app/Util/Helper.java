package app.Util;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//Class containing helper methods
public class Helper {

    public static Helper shared = new Helper();

    public Dimension getScreenSize() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }

    public void print(String message) {
        System.out.println(message);
    }

    public void setAppIcon(JFrame frame) {
        //loading an image from a file
        final Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        final URL imageResource = Main.class.getClassLoader().getResource("app/Resources/icon.png");
        final Image image = defaultToolkit.getImage(imageResource);

        //this is new since JDK 9
        final Taskbar taskbar = Taskbar.getTaskbar();

        try {
            //set icon for mac os (and other systems which do support this method)
            taskbar.setIconImage(image);
        } catch (final UnsupportedOperationException e) {
            System.out.println("The os does not support: 'taskbar.setIconImage'");
        } catch (final SecurityException e) {
            System.out.println("There was a security exception for: 'taskbar.setIconImage'");
        }

        //set icon for Windows OS (and other systems which do support this method)
        frame.setIconImage(image);
    }
}
