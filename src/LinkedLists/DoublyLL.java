package LinkedLists;



public class DoublyLL {

    Node head;
    Node tail;

    public static class Node {
        Node prev;
        int data;
        Node nxt;

        Node(int data){
            this.data =data;
            this.prev=null;
            this.nxt=null;
        }
    }

    public  void insertAtEnd(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head =newNode;
            tail = newNode;
            return ;
        }

        tail.nxt = newNode;
        newNode.prev=tail;
        tail= newNode;


    }
    public void insertAtFront(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.nxt = head;
        head.prev = newNode;
        head=newNode;
    }

    public void display(){

        if (head == null){
            System.out.println("List is Empty..");
        }
        Node temp = head ;

        while(temp != null){
            System.out.print(temp.data+" <-> ");
          temp = temp.nxt;
        }

        System.out.println("NULL");
    }

    public void displayR(){

        Node temp = tail;

        if (tail == null) {
            System.out.println("List is empty ..");
            return;
        };
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("NULL");
    }

    public void insertAtAny(int data, int position){
        Node newNode = new Node(data);

        if (position == 0){

            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            newNode.nxt = head;
            head.prev=newNode;
            head=newNode;

        }

        Node temp = head;

        for(int i=0; i < position-1 && temp != null; i++){
            temp=temp.nxt;
        }

        if (temp == null){
            System.out.println("Invalid position");
            return;
        }


        newNode.nxt=temp.nxt;
        newNode.prev=temp;

        if (temp!=null){

        }
        temp.nxt=newNode;
    }

    public int length(){
        Node temp =head;
        if (head == null) return 0;
        int count =0;
        while(temp!= null){
            count++;
            temp=temp.nxt;
        }

        return count;
    }

    public void deleteFromFront(){


        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.nxt == null) {
            head =null;
            tail = null;
            return;
        }

        head =  head.nxt;
        head.prev=null;

    }

    public void deleteFromEnd(){

        if (head == null){
            System.out.println("list is Empty");
            return;
        }

        if (head.nxt == null){
            head=null;
            tail=null;
            return;
        }

        tail = tail.prev;
        tail.nxt=null;
    }

    public void deleteAtAnyPosition(int position){

        if (head == null){
            System.out.println("List is empty..");
            return;
        }



        Node temp = head;


        for (int i=0;i< position && temp!=null;i++){
            temp= temp.nxt;
        }

        if (temp == null) {
            System.out.println("Invalid position ");
            return;
        }

        if (temp == head){
            head = head.nxt;

            if (head != null){

            head.prev=null;
            }else{
                tail= null;
            }
            return;
        }

        if (temp == tail){
            tail = tail.prev;
            tail.nxt=null;
            return;
        }

        temp.prev.nxt = temp.nxt;
        temp.nxt.prev= temp.prev;


    }


    public static void main(String[] args) {

        DoublyLL dd = new DoublyLL();

        dd.insertAtEnd(3);
        dd.insertAtEnd(4);
        dd.insertAtEnd(5);
        dd.insertAtEnd(6);

//        dd.display();
//
//        dd.insertAtFront(1);
//        dd.display();
//
//        dd.displayR();

//        dd.insertAtAny(99,2);
//        dd.display();
//
//        int len = dd.length();
//        System.out.println(len);
//
//        dd.deleteFromFront();
//        dd.display();
//
        dd.deleteFromEnd();
        dd.display();

        dd.deleteAtAnyPosition(2);

        dd.display();




    }
}
