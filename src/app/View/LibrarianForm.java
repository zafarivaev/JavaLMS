package app.View;


import app.View.Base.LMSForm;

import javax.swing.*;
import java.awt.*;

public class LibrarianForm {
    public JPanel Root;
    public JPanel Main;
    public JTabbedPane LibrarianSetting;
    public JButton logOutButton;
    public JPanel LogOutPanel;
    public JButton addStudentButton;
    public JButton editStudentButton;
    public JButton deleteStudentButton;
    public JButton addBookButton;
    public JButton editBookButton;
    public JButton deleteBookButton;
    public JPanel BookSettings;
    public JPanel BookButtonPanel;
    public JPanel StudentSettings;
    public JPanel TopTitlePanel;
    public JLabel titleLabel;
    public JPanel ProfileSettings;
    public JPanel ProfileButtonPanel;
    public JButton editProfileButton;
    public JButton deleteProfileButton;
    public JPanel ProfileInfoPanel;
    public JPanel CredentialsPanel;
    public JLabel firstNameLabel;
    public JTextField nameField;
    public JLabel lastNameLabel;
    public JLabel genderLabel;
    public JLabel emailLabel;
    public JLabel passwordLabel;
    public JTextField lastNameField;
    public JTextField genderField;
    public JTextField emailField;
    public JTextField passwordField;
    private JButton returnButton;
    private JButton saveButton;
    public JTable studentsTable;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Root = new JPanel();
        Root.setLayout(new BorderLayout(0, 0));
        Main = new JPanel();
        Main.setLayout(new BorderLayout(0, 0));
        Main.setBackground(new Color(-1));
        Root.add(Main, BorderLayout.CENTER);
        LibrarianSetting = new JTabbedPane();
        LibrarianSetting.setBackground(new Color(-1));
        Font LibrarianSettingFont = this.$$$getFont$$$("Arial", Font.PLAIN, 18, LibrarianSetting.getFont());
        if (LibrarianSettingFont != null) LibrarianSetting.setFont(LibrarianSettingFont);
        LibrarianSetting.setForeground(new Color(-12622362));
        Main.add(LibrarianSetting, BorderLayout.CENTER);
        StudentSettings = new JPanel();
        StudentSettings.setLayout(new BorderLayout(0, 0));
        LibrarianSetting.addTab("Students", StudentSettings);
        final JScrollPane scrollPane1 = new JScrollPane();
        StudentSettings.add(scrollPane1, BorderLayout.CENTER);
        studentsTable = new JTable();
        scrollPane1.setViewportView(studentsTable);
        BookSettings = new JPanel();
        BookSettings.setLayout(new BorderLayout(0, 0));
        BookSettings.setBackground(new Color(-1));
        Font BookSettingsFont = this.$$$getFont$$$("Arial", Font.PLAIN, 18, BookSettings.getFont());
        if (BookSettingsFont != null) BookSettings.setFont(BookSettingsFont);
        LibrarianSetting.addTab("Books", BookSettings);
        BookButtonPanel = new JPanel();
        BookButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        BookButtonPanel.setBackground(new Color(-1));
        BookSettings.add(BookButtonPanel, BorderLayout.SOUTH);
        addBookButton = new JButton();
        addBookButton.setBackground(new Color(-1));
        Font addBookButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, addBookButton.getFont());
        if (addBookButtonFont != null) addBookButton.setFont(addBookButtonFont);
        addBookButton.setForeground(new Color(-12622362));
        addBookButton.setText("Add");
        BookButtonPanel.add(addBookButton);
        editBookButton = new JButton();
        editBookButton.setBackground(new Color(-1));
        Font editBookButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, editBookButton.getFont());
        if (editBookButtonFont != null) editBookButton.setFont(editBookButtonFont);
        editBookButton.setForeground(new Color(-12622362));
        editBookButton.setText("Edit");
        BookButtonPanel.add(editBookButton);
        deleteBookButton = new JButton();
        deleteBookButton.setBackground(new Color(-1));
        Font deleteBookButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, deleteBookButton.getFont());
        if (deleteBookButtonFont != null) deleteBookButton.setFont(deleteBookButtonFont);
        deleteBookButton.setForeground(new Color(-12622362));
        deleteBookButton.setText("Delete");
        BookButtonPanel.add(deleteBookButton);
        returnButton = new JButton();
        returnButton.setBackground(new Color(-1));
        Font returnButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, returnButton.getFont());
        if (returnButtonFont != null) returnButton.setFont(returnButtonFont);
        returnButton.setForeground(new Color(-12622362));
        returnButton.setText("Return");
        BookButtonPanel.add(returnButton);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        BookSettings.add(panel1, BorderLayout.CENTER);
        ProfileSettings = new JPanel();
        ProfileSettings.setLayout(new BorderLayout(0, 0));
        LibrarianSetting.addTab("Profile", ProfileSettings);
        ProfileButtonPanel = new JPanel();
        ProfileButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        ProfileSettings.add(ProfileButtonPanel, BorderLayout.SOUTH);
        editProfileButton = new JButton();
        editProfileButton.setBackground(new Color(-1));
        Font editProfileButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, editProfileButton.getFont());
        if (editProfileButtonFont != null) editProfileButton.setFont(editProfileButtonFont);
        editProfileButton.setForeground(new Color(-12622362));
        editProfileButton.setText("Edit");
        ProfileButtonPanel.add(editProfileButton);
        deleteProfileButton = new JButton();
        deleteProfileButton.setBackground(new Color(-1));
        Font deleteProfileButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, deleteProfileButton.getFont());
        if (deleteProfileButtonFont != null) deleteProfileButton.setFont(deleteProfileButtonFont);
        deleteProfileButton.setForeground(new Color(-12622362));
        deleteProfileButton.setText("Delete");
        ProfileButtonPanel.add(deleteProfileButton);
        saveButton = new JButton();
        saveButton.setBackground(new Color(-1));
        saveButton.setEnabled(false);
        Font saveButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, saveButton.getFont());
        if (saveButtonFont != null) saveButton.setFont(saveButtonFont);
        saveButton.setForeground(new Color(-12622362));
        saveButton.setHideActionText(false);
        saveButton.setText("Save");
        ProfileButtonPanel.add(saveButton);
        ProfileInfoPanel = new JPanel();
        ProfileInfoPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        ProfileSettings.add(ProfileInfoPanel, BorderLayout.CENTER);
        CredentialsPanel = new JPanel();
        CredentialsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 5, new Insets(0, 0, 0, 0), -1, 10));
        CredentialsPanel.setOpaque(false);
        ProfileInfoPanel.add(CredentialsPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        firstNameLabel = new JLabel();
        firstNameLabel.setBackground(new Color(-12620058));
        Font firstNameLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, firstNameLabel.getFont());
        if (firstNameLabelFont != null) firstNameLabel.setFont(firstNameLabelFont);
        firstNameLabel.setForeground(new Color(-12620058));
        firstNameLabel.setText("First Name");
        CredentialsPanel.add(firstNameLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        nameField = new JTextField();
        nameField.setBackground(new Color(-1));
        nameField.setDisabledTextColor(new Color(-13619152));
        nameField.setEnabled(false);
        Font nameFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, nameField.getFont());
        if (nameFieldFont != null) nameField.setFont(nameFieldFont);
        nameField.setForeground(new Color(-16777216));
        nameField.setMargin(new Insets(3, 8, 3, 8));
        nameField.setOpaque(true);
        nameField.setText("");
        CredentialsPanel.add(nameField, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        lastNameLabel = new JLabel();
        lastNameLabel.setBackground(new Color(-12620058));
        Font lastNameLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, lastNameLabel.getFont());
        if (lastNameLabelFont != null) lastNameLabel.setFont(lastNameLabelFont);
        lastNameLabel.setForeground(new Color(-12620058));
        lastNameLabel.setText("Last Name");
        CredentialsPanel.add(lastNameLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        genderLabel = new JLabel();
        genderLabel.setBackground(new Color(-12620058));
        Font genderLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, genderLabel.getFont());
        if (genderLabelFont != null) genderLabel.setFont(genderLabelFont);
        genderLabel.setForeground(new Color(-12620058));
        genderLabel.setText("Gender");
        CredentialsPanel.add(genderLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        emailLabel = new JLabel();
        emailLabel.setBackground(new Color(-12620058));
        Font emailLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, emailLabel.getFont());
        if (emailLabelFont != null) emailLabel.setFont(emailLabelFont);
        emailLabel.setForeground(new Color(-12620058));
        emailLabel.setText("E-Mail");
        CredentialsPanel.add(emailLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        passwordLabel = new JLabel();
        passwordLabel.setBackground(new Color(-12620058));
        Font passwordLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, passwordLabel.getFont());
        if (passwordLabelFont != null) passwordLabel.setFont(passwordLabelFont);
        passwordLabel.setForeground(new Color(-12620058));
        passwordLabel.setText("Password");
        CredentialsPanel.add(passwordLabel, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        CredentialsPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        CredentialsPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        CredentialsPanel.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        lastNameField = new JTextField();
        lastNameField.setBackground(new Color(-1));
        lastNameField.setDisabledTextColor(new Color(-13619152));
        lastNameField.setEnabled(false);
        Font lastNameFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, lastNameField.getFont());
        if (lastNameFieldFont != null) lastNameField.setFont(lastNameFieldFont);
        lastNameField.setForeground(new Color(-16777216));
        lastNameField.setMargin(new Insets(3, 8, 3, 8));
        lastNameField.setOpaque(true);
        lastNameField.setText("");
        CredentialsPanel.add(lastNameField, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        genderField = new JTextField();
        genderField.setBackground(new Color(-1));
        genderField.setDisabledTextColor(new Color(-13619152));
        genderField.setEnabled(false);
        Font genderFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, genderField.getFont());
        if (genderFieldFont != null) genderField.setFont(genderFieldFont);
        genderField.setForeground(new Color(-16777216));
        genderField.setMargin(new Insets(3, 8, 3, 8));
        genderField.setOpaque(true);
        CredentialsPanel.add(genderField, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        emailField = new JTextField();
        emailField.setBackground(new Color(-1));
        emailField.setDisabledTextColor(new Color(-13619152));
        emailField.setEnabled(false);
        Font emailFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, emailField.getFont());
        if (emailFieldFont != null) emailField.setFont(emailFieldFont);
        emailField.setForeground(new Color(-16777216));
        emailField.setMargin(new Insets(3, 8, 3, 8));
        emailField.setOpaque(true);
        CredentialsPanel.add(emailField, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        passwordField = new JTextField();
        passwordField.setBackground(new Color(-1));
        passwordField.setDisabledTextColor(new Color(-13619152));
        passwordField.setEnabled(false);
        Font passwordFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, passwordField.getFont());
        if (passwordFieldFont != null) passwordField.setFont(passwordFieldFont);
        passwordField.setForeground(new Color(-16777216));
        passwordField.setMargin(new Insets(3, 8, 3, 8));
        passwordField.setOpaque(true);
        CredentialsPanel.add(passwordField, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        LogOutPanel = new JPanel();
        LogOutPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        LogOutPanel.setBackground(new Color(-1));
        Root.add(LogOutPanel, BorderLayout.SOUTH);
        logOutButton = new JButton();
        logOutButton.setBackground(new Color(-1));
        Font logOutButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, logOutButton.getFont());
        if (logOutButtonFont != null) logOutButton.setFont(logOutButtonFont);
        logOutButton.setForeground(new Color(-12622362));
        logOutButton.setText("Log out");
        LogOutPanel.add(logOutButton);
        TopTitlePanel = new JPanel();
        TopTitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
        TopTitlePanel.setBackground(new Color(-12620058));
        TopTitlePanel.setEnabled(true);
        Root.add(TopTitlePanel, BorderLayout.NORTH);
        titleLabel = new JLabel();
        Font titleLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 22, titleLabel.getFont());
        if (titleLabelFont != null) titleLabel.setFont(titleLabelFont);
        titleLabel.setForeground(new Color(-1));
        titleLabel.setText("Librarian");
        TopTitlePanel.add(titleLabel);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Root;
    }


}
