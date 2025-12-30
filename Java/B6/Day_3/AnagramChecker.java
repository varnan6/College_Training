package B6.Day_3;

import java.util.HashMap;

public class AnagramChecker {

    static boolean isAnagram(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (char ch : s2.toLowerCase().toCharArray()) {
            if (!map.containsKey(ch))
                return false;

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
