package Stacks;

public class StackUsingLL {

    public static class Node{
        int data;
        Node nxt;

        Node(int data){
            this.data=data;
            this.nxt=null;
        }
    }

     static Node top;
     static int size = 0;

    public static void push(int num){
        Node temp = new Node(num);
        temp.nxt=top;
        top= temp;
        size++;
    }

    public static int  pop(){
        Node temp = top;
        top=top.nxt;
        temp.nxt=null;
        size--;
        return temp.data;
    }

    public static int top(){
        return top.data;
    }

    public static void display(){
        Node temp = top;
        if (top==null) System.out.println("Stack is empty");
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.nxt;
        }

        System.out.println("null");
    }




    public static void main(String[] args) {

        Node node = new Node(0);
        push(3);
        push(2);
        push(3);

        display();

    }
}
