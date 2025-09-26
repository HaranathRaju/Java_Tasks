import java.util.*;
public class SortVlaues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("alice", 20);
        map.put("bob", 25);
        map.put("john", 15);
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

