package B6.Day_1;

public class SmallestElement {

    static int findSmallest(int[] arr) {

        int smallest = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallest)
                smallest = n;
        }

        return smallest;
    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3, 4, 5 },
                { 1, 9, 2, 8, 3, 7, 4, 6, 5 },
                { 11, 66, 88, 22, 77, 33 } };

        for (int[] testCase : testCases) {
            int result = findSmallest(testCase);
            System.out.println("Smallest element is: " + result);
            System.out.println();
        }
    }
}
