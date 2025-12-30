package B6.Day_3;

import Java.ListNode;

public class LoopInLinkedList {

    public ListNode loop_in_ll(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;

            if (fast != null)
                fast = fast.next;

            if (slow == fast)
                break;
        }

        return fast;
    }

    public static void main(String[] args) {
        // Write test case;
    }
}
