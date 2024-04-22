import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

        int grades = Integer.parseInt(JOptionPane.showInputDialog("Enter your grades"));

        if (grades > 60) {
            JOptionPane.showMessageDialog(null, "Congratulations! You pass!");
        }
         else {
            JOptionPane.showMessageDialog(null, "Sorry, you fail. Better luck next time!");
        }
    }
}
