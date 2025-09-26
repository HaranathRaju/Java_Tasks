import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordOccurance {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("filename.txt"));
            String data;
            while ((data = br.readLine()) != null) {
                String[] words = data.split("\\W+");
                for (String i : words) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
