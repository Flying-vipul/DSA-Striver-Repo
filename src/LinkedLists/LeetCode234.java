package LinkedLists;

public class LeetCode234 {

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

    public static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevSlow = null;

        while(fast != null && fast.next != null){
            prevSlow = slow;
            slow = slow.next;
            fast= fast.next.next;

        }

        if (prevSlow != null){
            prevSlow.next =null;
        }

        // Now our slow becomes second head .

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){
            ListNode nextTemp =curr.next;
            curr.next =prev;
            prev=curr;
            curr =nextTemp;
        }

        while(prev != null&&prev.next != null){

            assert head != null;
            if (prev.val != head.val){
                return false;
            }else{
                prev =prev.next;
                head=head.next;
            }


        }
        return true;



    }


}
