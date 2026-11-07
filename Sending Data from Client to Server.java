
import java.net.*;
import java.io.*;

public class Server7 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream()));

        String msg = in.readLine();
        System.out.println("Server: Received: " + msg);

        s.close();
        ss.close();
    }
}
