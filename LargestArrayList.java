import java.util.*;
public class LargestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6));
        int lar=list.get(0);
        int small=list.get(0);
        for (int i:list)  {
            if (i>lar) {
                lar=i;
            } 
            if(i<small) {
                small=i;
            }
        }
        System.out.println("largest element: "+lar);
        System.out.println("smallest element: "+small);

    }
    
}
