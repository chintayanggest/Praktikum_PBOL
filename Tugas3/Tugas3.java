// i still working on this //
////////THIS IS NOT FINISHED YET ///////
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JComponent;

public class Tugas3 {
    public static void main(String[]args){
        //Build Frame 
        JFrame frame = new JFrame("Sign Up Form");
        frame.setSize(320, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define CardLayout
        CardLayout card = new CardLayout();
        frame.getContentPane().setLayout(card);

        //Build signup panel
        JPanel signup = new JPanel();
        signup.setLayout(new BoxLayout(signup,BoxLayout.Y_AXIS));
        JLabel signUp = new JLabel("Sign Up",SwingConstants.CENTER);
        signUp.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        signup.add(signUp);

        //full name
        JPanel fullname = stylePanel("Full Name", 20);
        signup.add(fullname);

        //email
        JPanel email = stylePanel("Email",20);
        signup.add(email);

        //password
        JPanel password = stylePanel("Password", 20);
        signup.add(password);

        //ive an account
        JLabel account =new JLabel("ive have an account");
        signup.add(account); 
        JButton button1 = new JButton("Login");
        signup.add(button1);

        //adding signup panel into frame with card so we can switch panels
        frame.add(signup,"signup");

        //LOGIN
        JPanel login = new JPanel();
        JLabel logIn = new JLabel("Login");
        login.add(logIn);

        JPanel Email = stylePanel("Email", 20);
        login.add(Email);
        
        JPanel Password = stylePanel("Password", 20);
        login.add(Password);

        JButton button2 = new JButton("Login");
        login.add(button2);

        JLabel label2 = new JLabel(" I don't have an account");
        login.add(label2);

        JButton button3 = new JButton("Sign up");
        login.add(button3);

        //memasukkann login panel ke frame 
        frame.add(login,"login");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            card.show(frame.getContentPane(),"login");
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(frame.getContentPane(),"signup");
            }
        });
        
        card.show(frame.getContentPane(), "Login");

        frame.setVisible(true);

    }


    //to customize the panels
    private static JPanel stylePanel(String labelText, int textFieldSize){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBorder(new EmptyBorder(5,10,5,10));

        JLabel label = new JLabel(labelText);
        JTextField textField = new JTextField(textFieldSize);
        panel.add(label);
        panel.add(textField);

        return panel;
    }

    
}
