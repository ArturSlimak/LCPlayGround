import help_classes.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;


        ListNode first = dummy.next;
        ListNode second = first.next;
        while (second != null) {
            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            first = prev.next;
            if (first != null)
                second = first.next;
            else
                second = null;
        }


        return dummy.next;
    }
}
