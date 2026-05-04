package Stacks;

public class implementStack {

    int top =-1;
    int[] st = new int[10];


    public  void push(int num) {
        if (top <= 10){
        top++;
        st[top] = num;
        }else{
            System.out.println("Stack is Full");
        }
    }

    public int top(){
        if (top == -1){
            return -1;
        }
        return st[top];
    }

    public void pop(){
        if (top>-1){
            top--;
            st[top] = 0;
        }else{
            System.out.println("Stack is empty");
        }
    }

    public int size() {
        return top+1;
    }
}
