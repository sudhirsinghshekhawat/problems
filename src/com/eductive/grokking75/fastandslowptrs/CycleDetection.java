package com.eductive.grokking75.fastandslowptrs;

public class CycleDetection {

    public boolean detectCycle(LinkedListNode head) {
        if (head == null)
            return false;
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
