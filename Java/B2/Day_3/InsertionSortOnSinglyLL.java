package B2.Day_3;

import Java.Node;

public class InsertionSortOnSinglyLL {

    static Node insertionSortLL(Node head) {

        Node dummy = new Node(0);
        Node curr = head;

        while (curr != null) {

            Node next = curr.next;
            Node prev = dummy;

            while (prev.next != null && prev.next.value < curr.value) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;

    }

    public static void main(String args[]) {
        int[][] testCases = { { 1, 2, 3, 4 }, { 3, 1, 5, 2, 6, 7 }, { 5, 4, 3, 2, 1 } };

        for (int i = 0; i < testCases.length; i++) {
            Node head = null;
            for (int j = 0; j < testCases[i].length; j++) {
                Node newNode = new Node(testCases[i][j]);
                if (head == null) {
                    head = newNode;
                } else {
                    Node temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                }
            }

            Node sortedHead = insertionSortLL(head);

            while (sortedHead != null) {
                System.out.print("->" + sortedHead.value);
                sortedHead = sortedHead.next;
            }
            System.out.println();
        }
    }

}