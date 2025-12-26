package B6.Day_2;

public class SubsequenceExists {

    static boolean subsequence_exists(String s, String subS) {
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == subS.charAt(i))
                i++;
        }

        return i == subS.length();
    }

    public static void main(String[] args) {
        System.out.println(subsequence_exists("abcde", "ace"));
        System.out.println(subsequence_exists("abcde", "aec"));
    }
}
