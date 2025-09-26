import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 4 };
        int arr2[] = { 2, 2, 2, 4, 5 };
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int j : arr2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        System.out.println(list);
    }
}
