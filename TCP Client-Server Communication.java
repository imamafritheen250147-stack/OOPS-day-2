
import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server Waiting...");

            Socket socket = server.accept();

            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

            String message = input.readLine();

            System.out.println("Received: " + message);

            socket.close();
            server.close();

        } catch (IOException e) {
            System.out.println("Server Error");
        }
    }
}
