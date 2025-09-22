import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer> reverse=new ArrayList<>();
        for (int i=list.size()-1;i>=0;i--) {
            reverse.add(list.get(i));
        }
        System.out.println(reverse);
    }
    
}
