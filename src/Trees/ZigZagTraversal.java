package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public TreeNode(){}
    }

    public List<List<Integer>> zigzag(TreeNode root){

        List<List<Integer>> ans = new ArrayList<>();

        if (root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while (!q.isEmpty()){
            int currSize = q.size();
            List<Integer> currList = new LinkedList<>();

            for (int i=0;i<currSize;i++){
                TreeNode currNode = q.poll();
                assert currNode != null;
                if (leftToRight){
                    currList.addLast(currNode.val);
                }else {
                    currList.addFirst(currNode.val);
                }
                if (currNode.left!=null){
                    q.add(currNode.left);
                }
                if (currNode.right!=null){
                    q.add(currNode.right);
                }

            }
            leftToRight=!leftToRight;
            ans.add(currList);
        }
        return ans;
    }
}
