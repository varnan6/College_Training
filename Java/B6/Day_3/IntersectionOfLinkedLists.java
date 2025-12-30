package B6.Day_3;

import Java.ListNode;

public class IntersectionOfLinkedLists {

    public ListNode findIntersection(ListNode headA, ListNode headB) {

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {

            if (temp1 == null)
                temp1 = headB;
            else
                temp1 = temp1.next;

            if (temp2 == null)
                temp2 = headA;
            else
                temp2 = temp2.next;

        }

        return temp1;
    }

    public static void main(String[] args) {
        // Create test cases
    }
}
