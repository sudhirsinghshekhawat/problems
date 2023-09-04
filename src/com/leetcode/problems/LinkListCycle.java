package com.leetcode.problems;


import java.util.List;

public class LinkListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null)
            return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head.next;

        while (slowPtr != fastPtr) {
            slowPtr = slowPtr.next;
            if (fastPtr == null || fastPtr.next != null)
                return false;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return true;

    }
}

