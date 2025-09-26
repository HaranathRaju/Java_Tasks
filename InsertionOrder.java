import java.util.*;

public class InsertionOrder {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("apple","banana","apple","orange"));
        LinkedHashSet<String> linked=new LinkedHashSet<>();
        for (int i=0;i<list.size();i++) {
            if (!linked.contains(list.get(i))) {
                linked.add(list.get(i));
            }
        }
        System.out.println(linked);
    }
}
