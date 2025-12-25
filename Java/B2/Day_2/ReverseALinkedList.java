package B2.Day_2;

import Java.Node;

public class ReverseALinkedList {

    static Node reverseLL(Node head) {

        Node prev = null;
        Node curr = head;
        Node next = head.next;

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

            Node head = null;
            Node tail = null;

            for (int n : test) {
                if (head == null) {
                    head = new Node(n);
                    tail = head;
                } else {
                    tail.next = new Node(n);
                    tail = tail.next;
                }
            }

            Node reverse = reverseLL(head);

            while (reverse != null) {
                System.out.print("->" + reverse.value);
                reverse = reverse.next;
            }

            System.out.println();

        }

    }
}