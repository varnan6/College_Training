package B6.Day_2;

public class ReverseArray {

    static void reverse(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5 } };

        for (int[] arr : testCases) {
            reverse(arr);

            for (int n : arr) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
