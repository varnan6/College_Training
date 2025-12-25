package B2.Day_2;

import java.util.Scanner;
import java.lang.Math;

public class JumpSearch {

    static int jumpSearch(int[] arr, int find, int len) {

        int jump = (int) (Math.sqrt(len));
        int index = 0;
        while (arr[index] < find) {
            index += jump;
        }

        while (index >= (index - jump)) {

            if (arr[index] == find)
                return index;

            index--;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter array length: ");
        int len = scan.nextInt();

        System.out.println("======Enter a sorted array======");
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("\n Enter element " + i + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.print("\nEnter element to find: ");
        int find = scan.nextInt();

        int pos = jumpSearch(arr, find, len);

        if (pos != -1) {
            System.out.println("Your element was found at index: " + pos);
        } else {
            System.out.println("Your element doesn't exist in the array");
        }

        scan.close();
    }
}