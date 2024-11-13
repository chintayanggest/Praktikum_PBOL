import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Tugas3 {
    public static void main(String[] args) {
        // Build Frame
        JFrame frame = new JFrame("Sign Up Form");
        frame.setSize(420, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define CardLayout
        CardLayout card = new CardLayout();
        frame.getContentPane().setLayout(card);

        // Build signup panel
        JPanel signup = new JPanel(new GridBagLayout()); 
        signup.setBorder(new EmptyBorder(1,1,1,1 )); 

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Title label
        JLabel signUp = new JLabel("Sign Up", SwingConstants.CENTER);
        signUp.setFont(new Font("Arial", Font.BOLD, 30));
        gbc.gridwidth = 4; // Span across two columns
        gbc.gridx = 0;
        gbc.gridy = 0;
        signup.add(signUp, gbc);

        // Full name field
        gbc.gridwidth = 1; 
        gbc.gridx = 0;
        gbc.gridy = 1;
        signup.add(new JLabel("Full Name:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        JTextField fullNameField = new JTextField(20);
        signup.add(fullNameField, gbc);

        // Email field
        gbc.gridx = 0;
        gbc.gridy = 2;
        signup.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        JTextField emailField = new JTextField(20);
        signup.add(emailField, gbc);

        // Password field
        gbc.gridx = 0;
        gbc.gridy = 3;
        signup.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(20);
        signup.add(passwordField, gbc);

        // Sign up button
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 4;
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBackground(Color.GREEN);
        signup.add(signUpButton, gbc);

        // "I've an account" label and Login button
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 5;
        signup.add(new JLabel("I've an account"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 4;
        JButton loginSwitchButton = new JButton("Login");
        loginSwitchButton.setBackground(Color.GREEN);
        loginSwitchButton.setForeground(Color.RED);
        signup.add(loginSwitchButton, gbc);

        // Add signup panel to frame with CardLayout
        frame.add(signup, "signup");

        // Build login panel
        JPanel login = new JPanel(new GridBagLayout());
        login.setBorder(new EmptyBorder(1,1,1,1));

        // Title label for login
        JLabel logIn = new JLabel("Login", SwingConstants.CENTER);
        logIn.setFont(new Font("Serif", Font.BOLD, 30));
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 0;
        login.add(logIn, gbc);

        // Email field for login
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        login.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        JTextField loginEmailField = new JTextField(20);
        login.add(loginEmailField, gbc);

        // Password field for login
        gbc.gridx = 0;
        gbc.gridy = 2;
        login.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        JPasswordField loginPasswordField = new JPasswordField(20);
        login.add(loginPasswordField, gbc);

        // Login button
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 3;
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.GREEN);
        login.add(loginButton, gbc);

        // "I don't have an account" label and Sign up button
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 4;
        login.add(new JLabel("I don't have an account"), gbc);

        gbc.gridx = 1;
        JButton signupSwitchButton = new JButton("Sign Up");
        signupSwitchButton.setBackground(Color.GREEN);
        signupSwitchButton.setForeground(Color.RED);
        login.add(signupSwitchButton, gbc);

        // Add login panel to frame with CardLayout
        frame.add(login, "login");

        // Add action listeners to switch between panels
        loginSwitchButton.addActionListener(e -> card.show(frame.getContentPane(), "login"));
        signupSwitchButton.addActionListener(e -> card.show(frame.getContentPane(), "signup"));

        // Show SignUp panel initially
        card.show(frame.getContentPane(), "signup");

        frame.setVisible(true);
    }
}
