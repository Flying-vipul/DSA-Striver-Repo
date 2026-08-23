package BST;

public class MaxMinBST {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left = null;
            this.right = null;
        }
    }

    public int[] method(TreeNode root){
        int[] ans = new int[2];
        if (root == null){
            return ans;
        }

        TreeNode currNode = root;
        while(currNode.left!=null){
            currNode = currNode.left;
        }
        ans[0] =currNode.val;

        currNode = root;
        while (currNode.right != null){
            currNode = currNode.right;
        }
        ans[1] =currNode.val;

        return ans;


    }


}
