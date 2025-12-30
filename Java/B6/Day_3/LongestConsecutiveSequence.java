package B6.Day_3;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int[] lcs(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int min_num = Integer.MAX_VALUE;
        int max_num = Integer.MIN_VALUE;

        for (int n : arr) {
            set.add(n);
            if (min_num > n)
                min_num = n;
            if (max_num < n)
                max_num = n;
        }

        // {starting_number, how_many_numbers}
        int[] res = new int[2];

        int starting_num = min_num;
        for (int i = min_num; i <= max_num; i++) {
            if (set.contains(starting_num + 1))
                res[1]++;
            else
                starting_num = min_num;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] results = lcs(new int[] { 10, 4, 6, 7, 1, 2, 3 });
        System.out.println("Starting number: " + results[0]);
    }
}
