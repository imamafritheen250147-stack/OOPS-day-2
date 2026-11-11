
import javax.swing.*;
import java.awt.event.*;

public class Program4 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Greeting");

        JLabel l = new JLabel("Name:");
        JTextField t = new JTextField();
        JButton b = new JButton("Display");

        l.setBounds(50, 50, 80, 30);
        t.setBounds(120, 50, 150, 30);
        b.setBounds(100, 100, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t.getText();
                JOptionPane.showMessageDialog(
                    f, "Welcome " + name);
            }
        });

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(350, 220);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
