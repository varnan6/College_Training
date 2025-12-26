package B2.Day_3;

import java.util.Stack;

public class WhoCanSeeWhom {

    static int[] whoCanSeeWhom(int[] arr) {

        int len = arr.length;
        int[] resArr = new int[len];

        // Stores indices of previous biggest elements
        Stack<Integer> badaWala = new Stack<>();

        // ---------- LEFT PASS ----------
        for (int i = 0; i < len; i++) {

            if (badaWala.isEmpty()) {

                badaWala.push(i);
                resArr[i] = i; // boundary fix

            } else {

                int topIndex = badaWala.peek();

                if (arr[topIndex] >= arr[i]) {

                    resArr[i] = (i - topIndex) + 1;
                    badaWala.push(i);

                } else {

                    int temp = topIndex;

                    // FIX 1: correct while condition order
                    while (!badaWala.isEmpty() && arr[temp] < arr[i]) {
                        badaWala.pop();
                        if (!badaWala.isEmpty()) {
                            temp = badaWala.peek();
                        }
                    }

                    // FIX 2: handle empty stack correctly
                    if (badaWala.isEmpty())
                        resArr[i] = i;
                    else
                        resArr[i] = (i - temp) + 1;

                    // FIX 3: missing push
                    badaWala.push(i);
                }
            }
        }

        // Empty the stack for right pass
        badaWala = new Stack<>();

        // ---------- RIGHT PASS ----------
        for (int i = len - 1; i >= 0; i--) {

            if (badaWala.isEmpty()) {

                badaWala.push(i);
                resArr[i] += (len - i - 1); // boundary fix

            } else {

                int topIndex = badaWala.peek();

                if (arr[topIndex] >= arr[i]) {

                    // FIX 4: correct distance formula
                    resArr[i] += (topIndex - i) + 1;
                    badaWala.push(i);

                } else {

                    int temp = topIndex;

                    // FIX 1 (again): correct while condition order
                    while (!badaWala.isEmpty() && arr[temp] < arr[i]) {
                        badaWala.pop();
                        if (!badaWala.isEmpty()) {
                            temp = badaWala.peek();
                        }
                    }

                    // FIX 2 + 4: empty stack + correct index math
                    if (badaWala.isEmpty())
                        resArr[i] += (len - i);
                    else
                        resArr[i] += (temp - i) + 1;

                    // FIX 3: missing push
                    badaWala.push(i);
                }
            }
        }

        return resArr;
    }

    public static void main(String[] args) {

        int[] test = { 10, 6, 8, 5, 9, 11 };
        int[] result = whoCanSeeWhom(test);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
