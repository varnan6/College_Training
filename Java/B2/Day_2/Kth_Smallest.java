package B2.Day_2;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

class Kth_Smallest {

    public static int find_k_smallest(int[] arr, int k) {

        int res = Integer.MAX_VALUE;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : arr) {
            pq.offer(n);
        }

        while (k > 0) {
            res = pq.poll();
            k--;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the number of elements: ");
        int len = scan.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("\nEnter element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        System.out.print("\nEnter value of k: ");
        int k = scan.nextInt();

        int res = find_k_smallest(arr, k);

        System.out.print("\nThe kth smallest element in your given array is: " + res);

        scan.close();

    }

}