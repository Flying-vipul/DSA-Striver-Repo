package LinkedLists;

public class Leetcode25 {

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

    public  static void reverse(ListNode head){

        ListNode temp = head;
        ListNode prev = null;

        while(temp!= null){
            ListNode nextTemp = temp.next;
            temp.next = prev;
            prev = temp;
            temp= nextTemp;
        }

    }

    public static  ListNode KthNode(ListNode temp, int k){
        k = k-1;
        while(temp != null && k>0){
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static ListNode reverseFinal(ListNode head , int k){

        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;


        while(true){

            ListNode currNode = prevGroupEnd.next;
            ListNode kthNode = KthNode(currNode,k);

            if (kthNode == null) break;

            ListNode nextStart = kthNode.next;

            kthNode.next = null;
            reverse(currNode);

            prevGroupEnd.next = kthNode; // pointing the prev to new head;
            currNode.next=nextStart; // join the train again

            prevGroupEnd = currNode; // move anchor to forward

        }

        return dummy.next;


    }

}
