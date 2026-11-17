
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Welcome to Java File Handling");
            writer.close();

            BufferedReader reader =
                new BufferedReader(new FileReader("notes.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}
