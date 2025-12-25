package B6.Day_1;

public class ThreeLargestElement {

    static int[] findLargestThree(int[] arr) {

        int[] resArr = new int[3];

        for (int n : arr) {

            if (n > resArr[0]) {

                resArr[2] = resArr[1];
                resArr[1] = resArr[0];
                resArr[0] = n;

            } else if (n > resArr[1]) {

                resArr[2] = resArr[1];
                resArr[1] = n;

            } else if (n > resArr[2]) {

                resArr[2] = n;

            }
        }

        return resArr;
    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3, 4, 5 },
                { 1, 9, 2, 8, 3, 7, 4, 6, 5 },
                { 11, 66, 88, 22, 77, 33 } };

        for (int[] testCase : testCases) {
            int[] result = findLargestThree(testCase);
            System.out.print("\nThree largest elements are: ");
            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
