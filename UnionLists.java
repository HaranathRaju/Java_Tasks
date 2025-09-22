import java.util.*;

public class UnionLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : list1) {
            if (!list2.contains(i)) {
                list.add(i);
            }
        }
        for (int i : list2) {
            if (!list1.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
