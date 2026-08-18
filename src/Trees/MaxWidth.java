package Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    class Pair{
        TreeNode node;
        int index;
        public Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }


    public int widthOfBinaryTree(TreeNode root) {

        int maxWidth = Integer.MIN_VALUE;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,1));

        while(!q.isEmpty()){

            int currSize = q.size();

            int minIndex = q.peek().index;
            int first  =0;
            int last =0;

            for (int i=0;i<currSize;i++){

                Pair currPair = q.poll();
                int normalizeIndex = ( currPair.index - minIndex ) +1;
                if (i == 0){
                    first = normalizeIndex;
                }


                if (i == currSize-1){
                    last = normalizeIndex;
                }

                if (currPair.node.left != null){
                    q.add(new Pair(currPair.node.left,2*currPair.index));
                }

                if (currPair.node.right != null){
                    q.add(new Pair(currPair.node.right, 2*currPair.index+1));
                }
            }
            maxWidth = Math.max(maxWidth,(last-first)+1);
        }

        return maxWidth;
    }
}
