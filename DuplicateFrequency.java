import java.util.*;
public class DuplicateFrequency {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,4,5,5,5,3,2,2,6,7};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()) {
            if(entry.getValue()>1) {
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    } 
}
