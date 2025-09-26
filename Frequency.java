import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 3, 4, 5, 5, 5));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        for (int i : map.keySet()) {
            System.out.println(i + " = " + map.get(i));
        }
    }
}

