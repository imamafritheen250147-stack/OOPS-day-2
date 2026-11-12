import javax.swing.*;
import java.awt.event.*;

public class Program9 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Fahrenheit to Celsius");

        JLabel l = new JLabel("Fahrenheit:");
        JTextField t = new JTextField();
        JButton b = new JButton("Convert to Celsius");

        JLabel result = new JLabel("Result:");

        l.setBounds(30, 40, 100, 30);
        t.setBounds(130, 40, 120, 30);
        b.setBounds(50, 100, 200, 30);
        result.setBounds(50, 150, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    double fah = Double.parseDouble(t.getText());

                    double c = (fah - 32) * 5 / 9;

                    result.setText(
                        String.format("%.1f °C", c));
                }
                catch (NumberFormatException ex) {
                    result.setText("Enter valid temperature");
                }
            }
        });

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(result);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
