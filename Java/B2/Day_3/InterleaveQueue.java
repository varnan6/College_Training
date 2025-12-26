package B2.Day_3;

import java.util.Queue;
import java.util.LinkedList;

public class InterleaveQueue {

    static Queue<Integer> interleave(Queue<Integer> queue) {

        int len = queue.size();
        int[] arr = new int[queue.size()];

        int i = 0;

        while (!queue.isEmpty()) {
            arr[i] = queue.poll();
            i++;
        }

        for (int j = 0; j < (len / 2); j++) {
            queue.offer(arr[j]);
            queue.offer(arr[(len / 2) + j]);
        }

        return queue;
    }

    public static void main(String[] args) {

        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Queue<Integer> testQueue = new LinkedList<>();

        for (int n : test) {
            testQueue.offer(n);
        }

        Queue<Integer> res = interleave(testQueue);

        while (!res.isEmpty()) {
            System.out.print(res.poll() + " ");
        }

    }
}
