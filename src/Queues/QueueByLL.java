package Queues;

public class QueueByLL {

    public static class Node {

        int data;
        Node nxt;

        Node(int data){
            this.data = data;
            this.nxt = null;
        }
    }

    static Node start;
    static Node end;
    static int size =0;


    public static void push(int num){

        Node temp = new Node(num);
        if (start == null) {
             start = temp;
             end= temp;
        }else{
            end.nxt=temp;
            end = end.nxt;
        }
        size++;
    }

    public static void pop(){

        if (start == null) System.out.println("Queue is Empty");

        Node temp = start;
        start = start.nxt;



    }
}
