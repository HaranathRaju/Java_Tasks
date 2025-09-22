import java.util.*;
public class PalindromeArrayList {
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>(List.of('r','a','d','a','r'));
        ArrayList<Character> palin=new ArrayList<>();
        for (int i=list.size()-1;i>=0;i--) {
            palin.add(list.get(i));
        }
        if (list.equals(palin)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

