package B6.Day_2;

public class MaxProfit {

    static int[] maxProfit(int[] market) {

        int min_price = market[0];
        int max_price = market[0];

        int curr_min = min_price;
        int curr_max = max_price;

        for (int i = 1; i < market.length; i++) {

            if (market[i] == 0)
                continue;

            if (curr_min > market[i]) {

                curr_min = market[i];
                curr_max = market[i];

            } else if (curr_max < market[i]) {
                curr_max = market[i];
            }

            if ((curr_max - curr_min) > max_price - min_price) {
                max_price = curr_max;
                min_price = curr_min;
            }
        }

        /*
         * The below return statement is redundant as any two values can be used to find
         * the third. Hence, I have also removed the max_profit variable
         */

        // return new int[] { max_profit, max_price, min_price}

        return new int[] { max_price, min_price };
    }

    public static void main(String[] args) {

        int[] testCase = { 7, 3, 0, 2, 5, 8, 1 };

        int[] result = maxProfit(testCase);
        System.out.println("Max profit is: " + (result[0] - result[1]));
        System.out.println("Best buying point: " + result[0] + "\nBest selling point: " + result[1]);
    }

}
