public class User {

    public static void main(String[] args) {
        setupWindow();
    }

    private static void setupWindow() {
        Dimension screenSize = Helper.shared.getScreenSize();

        window = new JFrame("Library Management System");
        window.setSize((int)(screenSize.width * 0.5), (int)(screenSize.height * 0.5));
        window.setLocation((int)(screenSize.width * 0.25), (int)(screenSize.height * 0.25));
        setupUI(window);
        window.setVisible(true);
    }

    private static void setupUI(JFrame window) {
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
    }

    //Properties
    static JFrame window;
    static JPanel mainPanel;
    static JPanel topLabelsPanel;
    static JLabel lmsLabel;
    static JLabel iamLabel;
    static JPanel buttonsPanel;
    static JButton adminButton;
    static JButton librarianButton;
    static JButton studentButton;

}