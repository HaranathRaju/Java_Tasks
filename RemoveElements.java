import java.util.*;
public class RemoveElements {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Set.of(1, 2, 3, 4, 5));
        int threshold = 3;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int value = it.next();
            if (value < threshold) {
                it.remove();
            }
        }
        System.out.println(set);
    }
}
