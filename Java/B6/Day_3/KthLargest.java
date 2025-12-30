package B6.Day_3;

import java.util.PriorityQueue;

public class KthLargest {

    static int kth_largest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : arr) {
            pq.offer(n);
            if (k > 0)
                k--;
            else
                pq.poll();
        }

        return pq.poll();

    }

    public static void main(String[] args) {
        int[][] testCases = { { 1, 2, 3, 4, 5 }, { 66, 22, 88, 33, 92 }, { 9, 8, 4, 3, 2, 1 } };

        for (int[] test : testCases) {
            System.out.println("3rd largest element: " + kth_largest(test, 3));
        }
    }
}
