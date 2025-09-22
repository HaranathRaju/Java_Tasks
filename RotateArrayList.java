
import java.util.*;
public class RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> a = new ArrayList<>();
        int k = 2;
        int n = list.size();
        k = k % n;
        for (int i = n - k; i < n; i++) {
            a.add(list.get(i));
        }
        for (int i = 0; i < n - k; i++) {
            a.add(list.get(i));
        }
        System.out.println(a);
    }
}
