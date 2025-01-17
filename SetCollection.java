import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        // Sets

        // Instantiates a Set reference with an TreeSet implementation
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
