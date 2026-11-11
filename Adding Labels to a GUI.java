
import javax.swing.*;

public class Program2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Student Details");

        JLabel l1 = new JLabel("Name");
        JLabel l2 = new JLabel("Age");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);

        f.add(l1);
        f.add(l2);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
