package LinkedLists;

import java.util.List;

public class leetcode148 {

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

    public static  ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode secHead = helper(head);

        ListNode left = sortList(head);
        ListNode right = sortList(secHead);

        return mergeSort(left,right);
    }

    public static ListNode helper(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = head;
        ListNode secHead = head;

        while(fast!=null && fast.next !=  null){
            slow = slow.next;
            secHead =secHead.next;
            fast = fast.next.next;

        }
        slow.next = null;
        return secHead;
    }

    public static  ListNode mergeSort(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null ){
            if (l1.val<=l2.val){
                current.next =l1;
                l1 =l1.next;
            }else{
               current.next = l2;
               l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null){
            current.next =l1;
        }else{
            current.next=l2;
        }

        return dummy.next;

    }
}
