package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public boolean isSymmetric(TreeNode root) {

        if (root==null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode T1 = root.left;
        TreeNode T2 = root.right;
        if (root.left!=null){
            q.offer(T1);
        }
        if (root.right!=null){
            q.offer(T2);
        }
        while(!q.isEmpty()){
            TreeNode currNode1 = q.poll();
            TreeNode currNode2 = q.poll();
            if (currNode1==null && currNode2==null) continue;
            if(currNode1==null || currNode2==null || currNode1.val!=currNode2.val){
                return false;
            }
            q.offer(currNode1.left);
            q.offer(currNode2.right);

            q.offer(currNode1.right);
            q.offer(currNode2.left);

        }

        return true;

    }
}
