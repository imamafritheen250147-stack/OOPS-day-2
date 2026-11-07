import java.net.*;

public class Server6 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server: Waiting...");
        Socket s = ss.accept();
        System.out.println("Client Connected");
        s.close();
        ss.close();
    }
}
