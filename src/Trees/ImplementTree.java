package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementTree {

     class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }

      class BianryTree{
         Node root;
        public BianryTree(Node root){

        }
        public  void insertion(int data){
            if (root==null){
                Node root = new Node(data);
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                if (current.left == null){
                    current.left= new Node(data);
                    return;
                }else {
                    queue.add(current.left);
                }

                if (current.right == null){
                    current.right = queue.poll();
                    return;
                }else{
                    queue.add(current.right);
                }
            }
        }
    }

}
