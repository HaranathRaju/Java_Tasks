import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 2, 3, 3, 3, 4, 4, 5));
        ArrayList<Integer> unique = new ArrayList<>();
        for (int i : list) {
            if (!unique.contains(i)) {
                unique.add(i);
            }
        }
        System.out.println("List after removing duplicates : " + unique);
    }

}
