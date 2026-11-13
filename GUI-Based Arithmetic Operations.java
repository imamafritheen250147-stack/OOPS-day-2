
import javax.swing.*;
import java.awt.event.*;

public class Program6 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Subtract");
        JButton b3 = new JButton("Multiply");
        JButton b4 = new JButton("Divide");

        JLabel result = new JLabel("Result:");

        t1.setBounds(50, 30, 150, 30);
        t2.setBounds(50, 70, 150, 30);

        b1.setBounds(50, 120, 100, 30);
        b2.setBounds(160, 120, 110, 30);
        b3.setBounds(50, 160, 100, 30);
        b4.setBounds(160, 160, 110, 30);

        result.setBounds(50, 210, 250, 30);

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                double ans = 0;

                if (e.getSource() == b1)
                    ans = a + b;
                else if (e.getSource() == b2)
                    ans = a - b;
                else if (e.getSource() == b3)
                    ans = a * b;
                else if (e.getSource() == b4) {
                    if (b == 0) {
                        result.setText("Cannot divide by zero");
                        return;
                    }
                    ans = a / b;
                }

                result.setText("Result = " + ans);
            }
        };

        b1.addActionListener(action);
        b2.addActionListener(action);
        b3.addActionListener(action);
        b4.addActionListener(action);

        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(result);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
