package BST;

import java.util.ArrayDeque;

public class ValidateBST {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }
    public boolean isValidBST(TreeNode root) {

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        TreeNode prev = null;



        while(curr != null  || !stack.isEmpty()  ){
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if(prev!=null && curr.val <= prev.val){
                return false;
            }
            prev = curr;
            curr = curr.right;

        }

        return true;

    }
}
