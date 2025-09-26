import java.util.*;
public class IntersectionSets {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Set.of(1, 2, 3));
        HashSet<Integer> s2 = new HashSet<>(Set.of(2, 3, 4));
        HashSet<Integer> s3 = new HashSet<>(Set.of(3, 4, 5));
        List<Set<Integer>> listofsets = new ArrayList<>();
        listofsets.add(s1);
        listofsets.add(s2);
        listofsets.add(s3);
        Set<Integer> intersection = new HashSet<>(listofsets.get(0));
        for (int i = 1; i < listofsets.size(); i++) {
            intersection.retainAll(listofsets.get(i));
        }
        System.out.println(intersection);
    }
}


