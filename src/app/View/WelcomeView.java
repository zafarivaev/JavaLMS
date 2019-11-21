package app.View;

import app.Util.Helper;

import javax.swing.*;
import java.awt.*;

public class WelcomeView {

    public WelcomeView() {
        setupUI();
    }

    public void setupUI() {
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


        buttonsPanel.add(adminButton);

        librarianButton = new JButton();
        librarianButton.setText("Librarian");
        buttonsPanel.add(librarianButton);

        studentButton = new JButton();
        studentButton.setText("Student");
        buttonsPanel.add(studentButton);

        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getTopLabelsPanel() {
        return topLabelsPanel;
    }

    public JLabel getLmsLabel() {
        return lmsLabel;
    }

    public JButton getAdminButton() {
        return adminButton;
    }

    public JButton getLibrarianButton() {
        return librarianButton;
    }

    public JButton getStudentButton() {
        return studentButton;
    }

    //Properties
    private static JPanel mainPanel;
    private static JPanel topLabelsPanel;
    private static JLabel lmsLabel;
    private static JLabel iamLabel;
    private static JPanel buttonsPanel;
    private static JButton adminButton;
    private static JButton librarianButton;
    private static JButton studentButton;
}
