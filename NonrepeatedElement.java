import java.util.*;
public class NonrepeatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,2,3,1,4,4,5));
        for (int i:list) {
            int element=i;
            int freq=Collections.frequency(list,element);
            if (freq==1) {
                System.out.println("first non-repeated element: "+i);
                break; 
            }
        }
    }
}
