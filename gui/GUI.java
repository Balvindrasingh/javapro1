import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("My Frame");

        // Set the size of the frame
        frame.setSize(350, 250);

        // Specify what happens when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel
        JPanel panel = new JPanel();

        // Set the layout of the panel to null
        panel.setLayout(null);

        // Create a label for the user
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(60, 15, 110, 30);
        panel.add(userLabel);

        // Create a text field for the user
        JTextField userText = new JTextField();
        userText.setBounds(150, 20, 165, 25);
        panel.add(userText);

        // Create a label for the password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(60, 55, 110, 30);
        panel.add(passwordLabel);

        // Create a text field for the password
        JTextField passwordText = new JTextField();
        passwordText.setBounds(150, 60, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("login");
        button.setBounds(60, 100, 70, 25);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);

        button.addActionListener(e -> {
            // Get the text from the text fields
            String username = userText.getText();
            String password = passwordText.getText();

            if (username.equals("balli") && password.equals("1234")) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password. gaand marraa bsdk ");
            }
        });
    }
}
