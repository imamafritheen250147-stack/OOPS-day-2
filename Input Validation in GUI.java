
import javax.swing.*;
import java.awt.event.*;

public class Program7 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Input Validation");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton b = new JButton("Add");
        JLabel result = new JLabel("Result:");

        t1.setBounds(50, 40, 150, 30);
        t2.setBounds(50, 80, 150, 30);
        b.setBounds(50, 120, 100, 30);
        result.setBounds(50, 170, 250, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    double a = Double.parseDouble(t1.getText());
                    double c = Double.parseDouble(t2.getText());

                    result.setText("Sum = " + (a + c));
                }
                catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers.");
                }
            }
        });

        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(350, 260);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
