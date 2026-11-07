
import java.net.*;

public class ClientSocketDemo {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5000)) {
            System.out.println("Connected to Server");
        } catch (Exception e) {
            System.out.println("Unable to connect to the server.");
        }
    }
}
