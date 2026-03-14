package LinkedLists;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLoopOfLL {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public static int method(ListNode head){

       Map<ListNode, Integer> map =new HashMap<>();
       ListNode temp = head;
       int timer =1;
       while(temp != null){

           if (map.containsKey(temp)){
               int value= map.get(temp);
               return timer - value;
           }

           map.put(temp,timer);
           timer++;
           temp = temp.next;
       }
       return 0;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(7);
        ListNode d = new ListNode(9);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(5);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=c;

        int res = method(a);

        System.out.println(res);


    }
}
