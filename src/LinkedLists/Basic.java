package LinkedLists;

public class Basic {

    public static class Node {


        int data;
        Node nxt;

        Node(int data ) {

            this.data = data;
            this.nxt=null;
        }
    }

    public static void displayRecursive(Node head){
        if (head == null) return;
        System.out.print(head.data+" ");
        display(head.nxt);
    }

    public static void ReverseDisplayRecursive(Node head){
        if (head == null) return;
        ReverseDisplayRecursive(head.nxt);
        System.out.print(head.data+" ");
    }

    public static int length(Node head){
        int count =0;
        Node temp = head;

        while (temp != null){
            count ++;
            temp=temp.nxt;
        }
        return count;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.nxt;
        }

    }



    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(9);

        a.nxt =b;
        b.nxt =c;
        c.nxt =d;
//        d.nxt =null;

        Node x = new Node(10);
        b.nxt = x;
        x.nxt =c;

        display(a);
        System.out.println();
        displayRecursive(a);
        System.out.println();
        ReverseDisplayRecursive(a);
        System.out.println();

        System.out.println("Length of LL is :"+length(a));





    }


}
