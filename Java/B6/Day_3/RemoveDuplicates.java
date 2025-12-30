package B6.Day_3;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    static int[] remove_duplicates(int[] arr) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for (int n : arr) {
            if (!lhs.contains(n))
                lhs.add(n);
        }

        arr = new int[lhs.size()];
        int i = 0;
        for (Integer n : lhs) {
            arr[i] = n;
            i++;
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] result = remove_duplicates(new int[] { 1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 6, 7 });

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
