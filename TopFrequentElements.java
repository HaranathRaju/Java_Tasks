import java.util.HashMap;

public class TopFrequentElements {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int maxFreq = 0;
        int mostFrequent = arr[0]; // default value

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
            maxFreq = entry.getValue();
            mostFrequent = entry.getKey();
            }
        }
        System.out.println("maximum "+maxFreq);
        System.out.println(mostFrequent);
    }
 
}
