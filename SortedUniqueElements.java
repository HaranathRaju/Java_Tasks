import java.util.*;
public class SortedUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(7,2,9,1,2,9));
        TreeSet<Integer> set=new TreeSet<>();
        for (int i:list) {
            if(!set.contains(i)) {
                set.add(i);
            }
        }
        System.out.println(set);
    }
}

