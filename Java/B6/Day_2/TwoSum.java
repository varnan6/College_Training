package B6.Day_2;

// import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    static boolean twosum(int[] arr, int find) {

        // Brute force
        /*
         * for(int i=0; i<arr.length - 1; i++){
         * for(int j = 0; j < arr.length; j++){
         * if(arr[i] + arr[j] == find) return true;
         * }
         * }
         */

        // Two pointer
        /*
         * Arrays.sort(arr);
         * 
         * int left = 0;
         * int right = arr.length - 1;
         * 
         * while (left < right) {
         * if (arr[left] + arr[right] == find)
         * return true;
         * else if (arr[left] + arr[right] > find)
         * right--;
         * else
         * left++;
         * }
         */

        // HashSet (Optimal)
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            if (set.contains(find - n))
                return true;

            set.add(n);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] testCase = { 4, 0, 6, 12, 5, 8 };
        int find_sum = 7;

        System.out.println("Sum exists: " + twosum(testCase, find_sum));

    }
}
