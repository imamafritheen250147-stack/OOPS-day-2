
import java.util.ArrayList;
import java.util.Collections;

public class MarksSorting {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(60);
        marks.add(95);
        marks.add(70);

        Collections.sort(marks);

        System.out.println("Sorted Marks: " + marks);
    }
}
