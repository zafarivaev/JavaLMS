package app.Controller;

import app.Util.Helper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomeViewController extends ViewController {

    public static void main(String[] args) {
        setupUI();
    }

    public static void setupUI() {
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        topLabelsPanel = new JPanel(new BorderLayout());

        lmsLabel = new JLabel("Library Management System");
        lmsLabel.setFont(new Font("Avenir", Font.PLAIN, 30));
        topLabelsPanel.add(lmsLabel, BorderLayout.NORTH);

        iamLabel = new JLabel("I am:");
        iamLabel.setFont(new Font("Avenir", Font.PLAIN, 18));
        topLabelsPanel.add(iamLabel, BorderLayout.SOUTH);

        mainPanel.add(topLabelsPanel, BorderLayout.NORTH);

        buttonsPanel = new JPanel(new GridLayout(1, 3, 10, 10));

        adminButton = new JButton();
        adminButton.setText("Admin");
        adminButton.setPreferredSize(new Dimension(0, 70));
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Helper.shared.print("Admin clicked");
                LogInViewController auth = new LogInViewController();
                window.setVisible(false);
                window.dispose();
                auth.setupUI();
            }
        });

        buttonsPanel.add(adminButton);

        librarianButton = new JButton();
        librarianButton.setText("Librarian");
        librarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Helper.shared.print("Librarian clicked");
            }
        });
        buttonsPanel.add(librarianButton);

        studentButton = new JButton();
        studentButton.setText("Student");
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Helper.shared.print("Student clicked");
            }
        });
        buttonsPanel.add(studentButton);

        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        window.add(mainPanel);
        window.setVisible(true);
    }


    //Properties
    static JPanel mainPanel;
    static JPanel topLabelsPanel;
    static JLabel lmsLabel;
    static JLabel iamLabel;
    static JPanel buttonsPanel;
    static JButton adminButton;
    static JButton librarianButton;
    static JButton studentButton;

}
