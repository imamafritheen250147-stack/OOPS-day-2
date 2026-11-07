
import java.net.*;

public class ServerSocketDemo {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started...");
        System.out.println("Waiting for client...");

        Socket client = server.accept();
        client.close();
        server.close();
    }
}
