package B6.Day_1;

public class RecursiveBinarySearch {

    static int comparison_count; // Static variables are auto initialized to 0, hence not doing so here.

    static int binarySearch(int[] arr, int find, int top, int bottom) {

        if (top > bottom)
            return -1;

        int mid = top + (bottom - top) / 2;

        if (arr[mid] == find)
            return mid;
        else if (arr[mid] > find)
            bottom = mid - 1;
        else
            top = mid + 1;

        return binarySearch(arr, find, top, bottom);

    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15, 16, 17, 18 },
                { 22, 33, 44, 55, 66, 77, 88, 99 } };

        int[] find = { 6, 11, 110 };

        for (int i = 0; i < find.length; i++) {
            int resIndex = binarySearch(testCases[i], find[i], 0, testCases[i].length - 1);
            System.out.println("Element present at index: " + resIndex + " (doesn't exist if index is -1)");
            System.out.println();
        }
    }
}
