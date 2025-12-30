package B6.Day_3;

import java.util.TreeMap;
import java.util.Map;

public class CountCharFrequency {

    static TreeMap<Character, Integer> count_chars(String str) {

        TreeMap<Character, Integer> freqMap = new TreeMap<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch != ' ')
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        return freqMap;

    }

    public static void main(String[] args) {

        String[] testCases = { "Varnan", "Pneumonoultramicroscopicsilicovolcanoconiosis", "Om Pandey" };

        for (String str : testCases) {
            TreeMap<Character, Integer> map = count_chars(str);
            System.out.println();
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}