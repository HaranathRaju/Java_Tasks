import java.util.*;
class FirstNonDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(4, 5, 6, 4, 7, 8, 5));
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : list) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                duplicates.add(i);
            }
        }
        for (int i : set) {
            if (!duplicates.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
