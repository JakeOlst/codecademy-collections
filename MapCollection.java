import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class MapCollection {
    public static void main(String[] args) {
        List<Integer> myInts = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            myInts.add(random.nextInt(5));
        }

        System.out.println("myInts: " + myInts);

        Map<Integer, Integer> intCount = countNumbers(myInts);
        for (Map.Entry<Integer, Integer> entry : intCount.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + " appears: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> countNumbers(List<Integer> list) {
        Map<Integer, Integer> intCount = new HashMap<>();
        for (int i : list) {
            if (intCount.get(i) == null) {
                intCount.put(i, 1);
            } else {
                int count = intCount.get(i);
                count++;
                intCount.put(i, count);
            }
        }
        return intCount;
    }
}
