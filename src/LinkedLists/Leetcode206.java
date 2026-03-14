package LinkedLists;

public class Leetcode206 {

    public  class ListNode {
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

    public ListNode reverse(ListNode head){

        ListNode curr = head;
        ListNode prev =null;

        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next =prev;
            prev =curr;
            curr = nextTemp;
        }

        return prev;




    }
}
