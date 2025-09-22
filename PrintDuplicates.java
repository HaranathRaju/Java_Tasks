import java.util.*;
public class PrintDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,2,3,4,4,5,6,6));
        ArrayList<Integer> duplicates=new ArrayList<>();
        ArrayList<Integer> unique=new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            int element=list.get(i);
            int freq=Collections.frequency(list,element);  
            if (freq>1 && !duplicates.contains(list.get(i))) {
                duplicates.add(list.get(i));
            } else if (freq==1) {
                unique.add(list.get(i));
            }
        }
        System.out.println("duplicates are : "+duplicates);
        System.out.println("unique elements are : "+unique);
    }
}

