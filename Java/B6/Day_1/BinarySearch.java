package B6.Day_1;

public class BinarySearch {

    static int comparison_count; // Static variables are auto initialized to 0, hence not doing so here.

    static int binarySearch(int[] arr, int find) {

        int len = arr.length;

        int top = 0;
        int bottom = len - 1;
        int mid;

        while (top <= bottom) {

            mid = top + (bottom - top) / 2;

            if (arr[mid] == find) {
                return mid;
            } else if (arr[mid] > find) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
            comparison_count++;

        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15, 16, 17, 18 },
                { 22, 33, 44, 55, 66, 77, 88, 99 } };

        int[] find = { 6, 11, 110 };

        for (int i = 0; i < find.length; i++) {
            int resIndex = binarySearch(testCases[i], find[i]);
            System.out.println("Element present at index: " + resIndex + " (doesn't exist if index is -1)");
            System.out.println("Comparisons done: " + comparison_count);
            System.out.println();
        }
    }
}
