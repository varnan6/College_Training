package B2.Day_2;

import Java.ListNode;

public class ReverseALinkedList {

    static ListNode reverseLL(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while (curr != null) {

            curr.next = prev;

            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }

        }

        return prev;

    }

    public static void main(String[] args) {

        int[][] testCases = { { 1 }, { 1, 2, 3 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

        for (int[] test : testCases) {

            ListNode head = null;
            ListNode tail = null;

            for (int n : test) {
                if (head == null) {
                    head = new ListNode(n);
                    tail = head;
                } else {
                    tail.next = new ListNode(n);
                    tail = tail.next;
                }
            }

            ListNode reverse = reverseLL(head);

            while (reverse != null) {
                System.out.print("->" + reverse.value);
                reverse = reverse.next;
            }

            System.out.println();

        }

    }
}