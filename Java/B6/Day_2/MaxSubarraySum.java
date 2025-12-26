package B6.Day_2;

public class MaxSubarraySum {

    static int maxSubarraySum(int[] arr, int width) {

        int len = arr.length;

        if (width > len)
            return -1;

        int res = 0;

        for (int i = 0; i < len; i++) {

            System.out.println("Element is: " + arr[i]);

            if (i < width) {
                res += arr[i];
                continue;
            }

            res = Math.max((arr[i] - arr[i - width]), res);

        }

        return res;

    }

    public static void main(String[] args) {
        int[] testCase = { 3, 8, 2, 6, 9, 10, 4 };
        System.out.println("Max subarray sum of size 3 is: " + maxSubarraySum(testCase, 3));
    }
}
