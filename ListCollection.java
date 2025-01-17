import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        // Lists

        // Instantiates a List reference with an ArrayList implementation
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // Iterates through the list.
        for (String element : stringList) {
            System.out.println(element);
        }
    }
}
