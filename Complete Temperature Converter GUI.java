
import javax.swing.*;
import java.awt.event.*;

public class Program10 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Temperature Converter");

        JLabel l = new JLabel("Temperature:");
        JTextField t = new JTextField();

        JButton b1 = new JButton("Celsius to Fahrenheit");
        JButton b2 = new JButton("Fahrenheit to Celsius");
        JButton b3 = new JButton("Clear");

        JLabel result = new JLabel("Result:");

        l.setBounds(30, 30, 120, 30);
        t.setBounds(150, 30, 120, 30);

        b1.setBounds(50, 80, 220, 30);
        b2.setBounds(50, 120, 220, 30);
        b3.setBounds(100, 170, 100, 30);

        result.setBounds(50, 220, 250, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    double c = Double.parseDouble(t.getText());

                    double fah = (c * 9 / 5) + 32;

                    result.setText(
                        String.format("%.1f °F", fah));
                }
                catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers.");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    double fah = Double.parseDouble(t.getText());

                    double c = (fah - 32) * 5 / 9;

                    result.setText(
                        String.format("%.1f °C", c));
                }
                catch (NumberFormatException ex) {
                    result.setText("Please enter valid numbers.");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("");
                result.setText("Result:");
            }
        });

        f.add(l);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(result);

        f.setSize(350, 320);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
