
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        String msg = args.length > 1 ? args[1] : "Hello Server";

        try (Socket socket = new Socket(host, 5000);
             BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(
                 socket.getOutputStream(), true)) {

            System.out.println("Connected Successfully");
            out.println(msg);

            String reply = in.readLine();
            System.out.println("Reply: " + reply);

            System.out.println("Socket Closed");

        } catch (UnknownHostException e) {
            System.out.println("Error: Unknown host - " + host);
        } catch (ConnectException e) {
            System.out.println("Unable to connect to the server");
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
