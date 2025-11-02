import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Prekdu3 {
    public static void main(String[] args) {
        String filePath = "words.csv"; 

        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(",");
                for (String word : words) {
                    word = word.trim();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

       
        System.out.println("\nTop 3 most repeated words:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + ": " + list.get(i).getValue());
        }
    }
}
