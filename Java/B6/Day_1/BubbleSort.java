package B6.Day_1;

public class BubbleSort {

    static int[] bubbleSort(int[] arr) {

        int len = arr.length;

        for (int i = 1; i <= len; i++) {

            for (int j = 0; j < len - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3, 4, 5 },
                { 1, 9, 2, 8, 3, 7, 4, 6, 5 },
                { 11, 66, 88, 22, 66, 33 } };

        for (int[] testCase : testCases) {
            int[] result = bubbleSort(testCase);
            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
