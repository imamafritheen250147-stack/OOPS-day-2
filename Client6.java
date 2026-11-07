
import java.net.*;

public class Client6 {
    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 5000)) {
            System.out.println("Client: Connected Successfully");
        } catch (Exception e) {
            System.out.println("Unable to connect to the server.");
        }
    }
}
