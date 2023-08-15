package com.leetcode.problems;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class PartitionList {

    public ListNode partition(ListNode head, int x) {

        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);
        ListNode beforeCurr = before;
        ListNode afterCurr = after;

        while (head != null) {
            if (head.val < x) {
                beforeCurr.next = head;
                beforeCurr = beforeCurr.next;
            } else {
                afterCurr.next = head;
                afterCurr = afterCurr.next;
            }
            head = head.next;
        }

        afterCurr.next = null;
        beforeCurr.next = after.next;

        return before.next;


    }


}
