import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        // Queues

        // Instantiates a Queue reference with an LinkedList implementation
        Queue<String> line = new LinkedList<>();
        line.add("Mike");
        line.add("Isabel");
        line.add("Jenny");

        for(String name: line) {
            System.out.println(name);
        }
    }
}
