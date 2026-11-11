
import javax.swing.*;

public class Program3 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Name Input");

        JLabel l = new JLabel("Name:");
        JTextField t = new JTextField();

        l.setBounds(50, 50, 100, 30);
        t.setBounds(120, 50, 150, 30);

        f.add(l);
        f.add(t);

        f.setSize(350, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
