import help_classes.ListNode;

import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode firstPointer = dummy;
        ListNode endPointer = dummy;
        int distance = 0;
        while (distance != n) {
            endPointer = endPointer.next;
            distance++;
        }

        while (endPointer.next != null) {
            endPointer = endPointer.next;
            firstPointer = firstPointer.next;
        }

        firstPointer.next = firstPointer.next.next;

        return dummy.next;
    }

}
