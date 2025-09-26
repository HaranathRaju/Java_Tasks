import java.util.*;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String s = "swiss";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        boolean found=false;
        for (char i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (char j : map.keySet()) {
            if (map.get(j) == 1) {
                System.out.println("first non repeated character: " + j);
                found=true;
                break;
            }       
        }
        if (!found) {
            System.out.println("non repeated character not found");
        }
    }
}
