import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class Collections {
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

        // Sets

        // Instantiates a Set reference with an ArrayList implementation
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(3);
        sortedSet.add(7);
        sortedSet.add(27);
        sortedSet.add(7);

        // Iterates through the set
        for (Integer element : sortedSet) {
        System.out.println(element);
        }
    }
}
