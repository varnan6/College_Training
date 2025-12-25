package B6.Day_1;

public class ReverseNumber {

    static int reverse(int n) {
        boolean negative = n < 0;

        int res = 0;

        if (negative)
            n *= -1;

        while (n > 0) {
            res = (res * 10) + n % 10;
            n /= 10;
        }

        if (negative)
            res *= -1;

        return res;
    }

    public static void main(String[] args) {
        int[] test = { 1, 10, 25, 73, 234, -22, -1, -102 };
        for (int cases : test) {
            System.out.println("\nNumber: " + cases);
            System.out.println("Reverse: " + reverse(cases));
        }
    }
}
