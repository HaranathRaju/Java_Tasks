import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SubSetCheck {
    static <T> boolean check(Set<T> seta, Set<T> setb) {
        return setb.containsAll(seta);
    }
    public static void main(String[] args) {
        Set<Integer> seta = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setb = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(check(seta, setb));
    }
}
