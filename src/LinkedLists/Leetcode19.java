package LinkedLists;

public class Leetcode19 {

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


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode Emp = new ListNode(0);
        Emp.next = head;

        ListNode slow = Emp;
        ListNode fast = Emp;

        for (int i=0; i<n;i++){
            fast= fast.next;
        }

        while(fast.next != null){
            slow =slow.next;
            fast =fast.next;
        }

        if (slow.next != null){
            slow.next=slow.next.next;
        }

        return Emp.next;
    }


}
