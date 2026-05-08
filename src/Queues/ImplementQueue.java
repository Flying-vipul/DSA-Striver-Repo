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
        }
        else{
            end = (end+1)%size;
        }
        que[end] = num;
        currSize++;
    }

    public static int pop(){
        if (currSize==0) return -1;
        int ele = que[start];
        if (currSize == 1) {
            start =-1;
            end = -1;

        }else{
            start = (start+1)%size;
        }
        currSize-=1;
        return ele;
    }

    public static void top(){
        if(start == -1) System.out.println("queue is full");;
        System.out.println(que[start]);
    }

    public static void  display(){
        for (int i=start;i<=end;i++){
            System.out.print(que[i]+" ");
        }
    }

    public static void main(String[] args) {
        push(3);
        push(2);
        push(1);
        pop();

        display();
        System.out.println();
        top();
    }
}
