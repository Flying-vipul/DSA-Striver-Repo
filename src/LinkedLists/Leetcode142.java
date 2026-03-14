package LinkedLists;

public class Leetcode142 {

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

    public ListNode method(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                slow = head; // Teleport slow to start

                // Phase 2: Move both at speed 1 until they meet
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                // They met! Return the start of the cycle.
                return slow;
            }


        }

        return null;
    }
}
