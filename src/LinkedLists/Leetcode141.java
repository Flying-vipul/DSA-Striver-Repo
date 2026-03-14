package LinkedLists;

public class Leetcode141 {

    public class ListNode {
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

    public boolean cycle(ListNode head){
        ListNode temp = head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null){

           slow = slow.next;
           fast =fast.next.next;

           if (slow == fast){
               return true;
           }


        }

        return false;
    }
}
