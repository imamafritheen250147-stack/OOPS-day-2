
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TemperatureConverter {

    public static void main(String[] args) {

        JFrame f = new JFrame("Temperature Converter");

        JLabel l1 = new JLabel("Temperature:");
        JTextField t1 = new JTextField();

        JButton b1 = new JButton("C to F");
        JButton b2 = new JButton("F to C");
        JButton b3 = new JButton("Clear");

        JLabel result = new JLabel("Result:");

        l1.setBounds(40, 30, 100, 30);
        t1.setBounds(150, 30, 150, 30);

        b1.setBounds(30, 90, 100, 35);
        b2.setBounds(145, 90, 100, 35);
        b3.setBounds(260, 90, 80, 35);

        result.setBounds(40, 150, 350, 40);

        DecimalFormat df = new DecimalFormat("0.0##");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String input = t1.getText().trim();

                if (input.isEmpty()) {
                    result.setText(
                        "Please enter a temperature value.");
                    return;
                }

                try {
                    double c = Double.parseDouble(input);

                    if (!Double.isFinite(c)) {
                        throw new NumberFormatException();
                    }

                    double fah = (c * 9 / 5) + 32;

                    result.setText(
                        "Result: " + df.format(fah) + " °F");
                }
                catch (NumberFormatException ex) {
                    result.setText(
                        "Invalid input! Please enter a numeric value.");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String input = t1.getText().trim();

                if (input.isEmpty()) {
                    result.setText(
                        "Please enter a temperature value.");
                    return;
                }

                try {
                    double fah = Double.parseDouble(input);

                    if (!Double.isFinite(fah)) {
                        throw new NumberFormatException();
                    }

                    double c = (fah - 32) * 5 / 9;

                    result.setText(
                        "Result: " + df.format(c) + " °C");
                }
                catch (NumberFormatException ex) {
                    result.setText(
                        "Invalid input! Please enter a numeric value.");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                t1.setText("");
                result.setText("Result:");
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(result);

        f.setSize(410, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
