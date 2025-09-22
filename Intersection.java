import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 4, 5, 8));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 5, 7, 8, 9));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : list1) {
            if (!list.contains(i) && list2.contains(i)) {
                list.add(i);
            }
        }
        System.out.println("elements which are present in both lists: " + list);
    }
}
