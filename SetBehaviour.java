import java.util.*;
class SetBehaviour {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 3, 5, 1, 2));
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();
        LinkedHashSet<Integer> linked = new LinkedHashSet<>();
        for (int i : list) {
            if (!set.contains(i)) {
                set.add(i);
                tree.add(i);
                linked.add(i);
            }
        }
        System.out.println(set);
        System.out.println(tree);
        System.out.println(linked);
    }
}