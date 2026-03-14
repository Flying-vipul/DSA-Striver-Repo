package LinkedLists;

public class Leetcode2095 {


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

    public ListNode deleteMiddle(ListNode head) {



        ListNode dummy = new ListNode(0);

        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = head;

        if (fast.next == null) return null;

        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if (slow.next!= null){
        slow.next = slow.next.next;
        }

        return head;

    }


}
