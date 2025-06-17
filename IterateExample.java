import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Get the iterator
        Iterator<String> iterator = colors.iterator();

        // Use iterator to loop through the list
        System.out.println("Iterating over the list:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}