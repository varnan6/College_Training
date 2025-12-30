package B6.Day_3;

import java.util.HashMap;

public class TwoSumWithIndex {

    static int[] twosum(int[] arr, int find) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // <Value, index>

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(find - arr[i])) {
                return new int[] { i, map.get(find - arr[i]) }; // Index 1, index 2
            }

            map.put(arr[i], i);
        }

        return new int[] {};

    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 5, 7, 9, 12, 14, 15 }, { 1, 2, 3, 4 } };
        int[] find = { 19, 8 };

        for (int i = 0; i < testCases.length; i++) {
            int[] result = twosum(testCases[i], find[i]);
            if (result.length == 0) {
                System.out.println("\nThe sum pair doesn't exist in the array");
            } else {
                System.out.println("\nNumber 1: " + testCases[i][result[0]] + " at index: " + result[0]);
                System.out.println("Number 2: " + testCases[i][result[1]] + " at index: " + result[1]);
            }
        }
    }
}
