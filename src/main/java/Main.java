import help_classes.ListNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)
                                )
                        )
                )
        );
        SwapNodesInPairs x = new SwapNodesInPairs();

        System.out.println(x.swapPairs(head));


    }
}
