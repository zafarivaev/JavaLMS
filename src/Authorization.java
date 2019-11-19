import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

import javax.swing.*;

public class Authorization {

    public static void main(String[] args) {
        setupUI();
    }

    public static void setupUI(){
        Dimension screenSize = Helper.shared.getScreenSize();

        JFrame mainPageFrame = new JFrame("Authorization");
        mainPageFrame.setSize((int)(screenSize.width * 0.5), (int)(screenSize.height * 0.5));
        mainPageFrame.setLocation((int)(screenSize.width * 0.25), (int)(screenSize.height * 0.25));

        JPanel panel = new JPanel();

        final JButton buttonAdmin = new JButton("Admin");
        mainPageFrame.getContentPane().add(BorderLayout.CENTER, buttonAdmin);
        mainPageFrame.setVisible(true);
    }


}
