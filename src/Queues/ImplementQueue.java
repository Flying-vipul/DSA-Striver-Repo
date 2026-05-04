package Queues;

public class ImplementQueue {

    static int size = 3;
    static int[] que = new int[size];
    static int currSize = 0;
    static int start = -1;
    static int end = -1;


    public static void push(int num){
        if (currSize == size){
            System.out.println("Queue is full");
        } else if (currSize == 0){
            start =0;
            end = 0;
            que[end] = num;
            currSize++;
        }
        else{
            end++;
            que[end] = num;
            currSize++;
        }
    }

    public static void  display(){
        for (int i=start;i<=end;i++){

        }
    }

    public static void main(String[] args) {
        push(3);
        push(2);
        push(1);
        display();

    }
}
