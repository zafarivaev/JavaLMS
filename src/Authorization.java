import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Authorization {

    public static void main(String[] args) {

        // Creating frame
        JFrame mainPageFrame = new JFrame("Authorization");
        mainPageFrame.setSize(600, 400);
        mainPageFrame.setLocation(300,200);
        final JButton buttonAdmin = new JButton("Admin");
        mainPageFrame.getContentPane().add(BorderLayout.CENTER, buttonAdmin);
        mainPageFrame.setVisible(true);
    }


}
