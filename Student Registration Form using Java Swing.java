
import javax.swing.*;
import java.awt.event.*;

public class StudentForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Student Registration");

        JLabel l = new JLabel("Student Name:");
        l.setBounds(30, 30, 120, 30);

        JTextField t = new JTextField();
        t.setBounds(150, 30, 150, 30);

        JButton b = new JButton("Submit");
        b.setBounds(100, 80, 100, 30);

        b.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                f, "Welcome " + t.getText());
        });

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(350, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
