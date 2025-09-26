import java.util.*;

public class SetPerformance {
    public static void main(String[] args) {
        int n = 100000;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        HashSet<Integer> set = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i : list) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        LinkedHashSet<Integer> linked = new LinkedHashSet<>();
        start = System.currentTimeMillis();
        for (int i : list) {
            linked.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        TreeSet<Integer> tree = new TreeSet<>();
        start = System.currentTimeMillis();
        for (int i : list) {
            tree.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }

}
