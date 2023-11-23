package com.eductive.grokking75.fastandslowptrs;

public class MiddleNode {

    public static LinkedListNode middleNode(LinkedListNode head) {
        if (head == null)
            return head;

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;


    }

}
