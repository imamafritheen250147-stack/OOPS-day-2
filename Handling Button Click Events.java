
import javax.swing.*;
import java.awt.event.*;

public class Program5 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Add");

        JLabel result = new JLabel("Result:");

        t1.setBounds(50, 40, 150, 30);
        t2.setBounds(50, 80, 150, 30);
        b.setBounds(50, 120, 100, 30);
        result.setBounds(50, 160, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());

                int sum = a + c;

                result.setText("Sum = " + sum);
            }
        });

        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(300, 260);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
