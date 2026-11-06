
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("Server started on port 5000");
            System.out.println("Host: " +
                InetAddress.getLocalHost().getHostAddress());

            while (true) {
                try (Socket socket = server.accept();
                     BufferedReader in = new BufferedReader(
                         new InputStreamReader(socket.getInputStream()));
                     PrintWriter out = new PrintWriter(
                         socket.getOutputStream(), true)) {

                    System.out.println("Client Connected");
                    String msg = in.readLine();

                    if (msg == null) msg = "";
                    System.out.println("Received: " + msg);

                    out.println("Welcome Client");
                    System.out.println("Connection Closed");
                } catch (IOException e) {
                    System.out.println("Client error: " + e.getMessage());
                }
            }
        } catch (BindException e) {
            System.out.println("Port 5000 is already in use");
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
