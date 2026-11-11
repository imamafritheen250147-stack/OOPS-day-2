
import javax.swing.*;

public class Program1 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Java GUI");

        JLabel l = new JLabel("Welcome to Java GUI");

        l.setBounds(100, 100, 200, 30);

        f.add(l);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
