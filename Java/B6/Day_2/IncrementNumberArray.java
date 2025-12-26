package B6.Day_2;

public class IncrementNumberArray {

    // Standard basic addition logic.
    static int[] increment(int[] num) {

        int carry = 1;
        int i = num.length - 1;

        do {

            num[i] = num[i] + carry;
            carry = num[i] / 10;
            num[i] = num[i] % 10;

            i--;

        } while (i >= 0 && carry > 0);

        if (i < 0 && carry == 1) {
            int[] res = new int[num.length + 1];
            res[0] = 1;
            for (int j = 0; j < num.length; j++) {
                res[j + 1] = num[j];
            }

            return res;
        }

        return num;

    }

    // Simpler and easier addition logic.
    static int[] incrementOptimized(int[] num) {

        int i = num.length - 1;

        while (i >= 0 && num[i] == 9) {
            num[i] = 0;
            i--;
        }

        if (i >= 0) {
            num[i]++;
            return num;
        }

        int[] res = new int[num.length + 1];
        res[0] = 1;

        for (int j = 0; j < num.length; j++) {
            res[j + 1] = num[j];
        }

        return res;

    }

    public static void main(String[] args) {

        int[][] testCases = { { 1, 2, 3 }, { 1, 2, 9 }, { 9, 9, 9 }, { 8, 9, 9, 9 } };

        for (int[] test : testCases) {
            int[] result = incrementOptimized(test);
            System.out.print("\nincremented array is: ");
            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
