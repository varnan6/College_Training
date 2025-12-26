package B6.Day_2;

public class StringCombo {

    // // recursive method (memory inefficient)
    // static String[] string_combo_rec(String s, int index) {
    // String ss = "";

    // return new String[0];
    // }

    // Iterative method
    static String[] string_combo_iter(String s) {

        String[] res = new String[(int) (Math.pow(2, s.length()))];
        StringBuilder sb;

        int i = 1;

        while (i < res.length) {

            sb = new StringBuilder();

            System.out.println("\nIteration " + i + ": ");
            int temp = i;

            int index = 0;
            while (temp > 0) {

                boolean include = temp % 2 == 1;

                System.out.println("index is: " + index);
                if (include) {
                    System.out.println("Appending: " + s.charAt(index));
                    sb.append(s.charAt(index));
                }

                index++;

                temp = temp >> 1;
            }

            res[i] = sb.toString();
            System.out.println("String is: " + res[i]);
            i++;

        }

        return res;
    }

    public static void main(String[] args) {
        String[] results = string_combo_iter("abc");
        for (String s : results) {
            System.out.println(s);
        }
    }
}
