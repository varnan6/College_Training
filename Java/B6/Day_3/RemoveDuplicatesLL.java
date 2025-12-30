package B6.Day_3;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicatesLL {

    static LinkedList<Integer> remove_duplicates_ll(LinkedList<Integer> arr) {

        // Normie way
        /*
         * LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
         * 
         * for (int n : arr) {
         * if (!lhs.contains(n))
         * lhs.add(n);
         * }
         * 
         * arr = new LinkedList<>(lhs);
         * 
         * return arr;
         */

        // Add all method
        /*
         * LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
         * lhs.addAll(arr);
         * 
         * return new LinkedList<>(lhs);
         */

        // Parameterised constructor
        /*
         * LinkedHashSet<Integer> lhs = new LinkedHashSet<>(arr);
         * return new LinkedList<>(lhs);
         */

        // Ekdum one-shot
        return new LinkedList<>(new LinkedHashSet<Integer>(arr));

    }

    public static void main(String[] args) {

        LinkedList<Integer> result = remove_duplicates_ll(
                new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 6, 7)));

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
