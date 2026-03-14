package LinkedLists;

import java.util.ArrayList;

public class leetcode328 {

    public static class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next =even.next.next;
            even=even.next;
        }
        odd.next =evenHead;

        return head;
    }
}
