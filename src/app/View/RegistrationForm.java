package app.View;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public JPanel Root;

    public JPanel TitlePanel;
    public JLabel titleLabel;

    public JPanel CredentialsPanel;
    public JLabel firstNameLabel;
    public JTextField nameField;

    public JLabel lastNameLabel;
    public JTextField lastNameField;

    public JLabel genderLabel;
    public ButtonGroup genderRadioButtonGroup;
    public JRadioButton maleRadioButton;
    public JRadioButton femaleRadioButton;

    public JLabel passwordLabel;
    public JPasswordField passwordField;

    public JLabel confirmPasswordLabel;
    public JPasswordField confirmPasswordField;

    public JLabel emailLabel;
    public JTextField emailField;

    public JButton registerButton;

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
        Root.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        Root.setBackground(new Color(-1));
        Root.setPreferredSize(new Dimension(1690, 345));
        TitlePanel = new JPanel();
        TitlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
        TitlePanel.setBackground(new Color(-12620058));
        TitlePanel.setEnabled(true);
        Root.add(TitlePanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        titleLabel = new JLabel();
        Font titleLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 22, titleLabel.getFont());
        if (titleLabelFont != null) titleLabel.setFont(titleLabelFont);
        titleLabel.setForeground(new Color(-1));
        titleLabel.setText("Register");
        TitlePanel.add(titleLabel);
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        Root.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        CredentialsPanel = new JPanel();
        CredentialsPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 5, new Insets(0, 0, 0, 0), -1, 10));
        CredentialsPanel.setOpaque(false);
        Root.add(CredentialsPanel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
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
        Font nameFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, nameField.getFont());
        if (nameFieldFont != null) nameField.setFont(nameFieldFont);
        nameField.setForeground(new Color(-16777216));
        nameField.setMargin(new Insets(2, 5, 2, 5));
        nameField.setOpaque(false);
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
        lastNameField = new JTextField();
        lastNameField.setBackground(new Color(-1));
        lastNameField.setDisabledTextColor(new Color(-13619152));
        Font lastNameFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, lastNameField.getFont());
        if (lastNameFieldFont != null) lastNameField.setFont(lastNameFieldFont);
        lastNameField.setForeground(new Color(-16777216));
        lastNameField.setMargin(new Insets(2, 5, 2, 5));
        lastNameField.setOpaque(false);
        CredentialsPanel.add(lastNameField, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setOpaque(false);
        CredentialsPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        maleRadioButton = new JRadioButton();
        maleRadioButton.setBackground(new Color(-12620058));
        maleRadioButton.setForeground(new Color(-12620058));
        maleRadioButton.setOpaque(false);
        maleRadioButton.setText("Male");
        panel1.add(maleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 2, false));
        femaleRadioButton = new JRadioButton();
        femaleRadioButton.setBackground(new Color(-12620058));
        femaleRadioButton.setForeground(new Color(-12620058));
        femaleRadioButton.setOpaque(false);
        femaleRadioButton.setText("Female");
        panel1.add(femaleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        panel1.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        confirmPasswordLabel = new JLabel();
        confirmPasswordLabel.setBackground(new Color(-12620058));
        Font confirmPasswordLabelFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, confirmPasswordLabel.getFont());
        if (confirmPasswordLabelFont != null) confirmPasswordLabel.setFont(confirmPasswordLabelFont);
        confirmPasswordLabel.setForeground(new Color(-12620058));
        confirmPasswordLabel.setText("Confirm");
        CredentialsPanel.add(confirmPasswordLabel, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        emailField = new JTextField();
        emailField.setBackground(new Color(-1));
        emailField.setDisabledTextColor(new Color(-13619152));
        Font emailFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, emailField.getFont());
        if (emailFieldFont != null) emailField.setFont(emailFieldFont);
        emailField.setForeground(new Color(-16777216));
        emailField.setMargin(new Insets(2, 5, 2, 5));
        emailField.setOpaque(false);
        CredentialsPanel.add(emailField, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(-1));
        passwordField.setDisabledTextColor(new Color(-13619152));
        Font passwordFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, passwordField.getFont());
        if (passwordFieldFont != null) passwordField.setFont(passwordFieldFont);
        passwordField.setForeground(new Color(-16777216));
        passwordField.setMargin(new Insets(2, 5, 2, 5));
        passwordField.setOpaque(false);
        CredentialsPanel.add(passwordField, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBackground(new Color(-1));
        confirmPasswordField.setDisabledTextColor(new Color(-13619152));
        Font confirmPasswordFieldFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, confirmPasswordField.getFont());
        if (confirmPasswordFieldFont != null) confirmPasswordField.setFont(confirmPasswordFieldFont);
        confirmPasswordField.setForeground(new Color(-16777216));
        confirmPasswordField.setMargin(new Insets(2, 5, 2, 5));
        confirmPasswordField.setOpaque(false);
        CredentialsPanel.add(confirmPasswordField, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 40), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        CredentialsPanel.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        CredentialsPanel.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer5 = new com.intellij.uiDesigner.core.Spacer();
        CredentialsPanel.add(spacer5, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        registerButton = new JButton();
        registerButton.setBackground(new Color(-12620058));
        Font registerButtonFont = this.$$$getFont$$$("Arial", Font.PLAIN, 16, registerButton.getFont());
        if (registerButtonFont != null) registerButton.setFont(registerButtonFont);
        registerButton.setForeground(new Color(-12620058));
        registerButton.setOpaque(false);
        registerButton.setText("Register");
        Root.add(registerButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(100, 40), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer6 = new com.intellij.uiDesigner.core.Spacer();
        Root.add(spacer6, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);
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