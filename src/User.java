import java.awt.*;

import javax.swing.*;

public class User {

    public static void main(String[] args) {
        setupUI();
    }

    private static void setupUI() {
        Dimension screenSize = Helper.shared.getScreenSize();

        JFrame frame = new JFrame("JavaLMS");
        frame.setSize((int)(screenSize.width * 0.5), (int)(screenSize.height * 0.5));
        frame.setLocation((int)(screenSize.width * 0.25), (int)(screenSize.height * 0.25));

        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.NORTH);

        JLabel lmsLabel = new JLabel("Library Management System");
        lmsLabel.setFont(new Font("Avenir", Font.PLAIN, 30));
        panel.add(lmsLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
