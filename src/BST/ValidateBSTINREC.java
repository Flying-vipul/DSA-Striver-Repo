package BST;

public class ValidateBSTINREC {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public boolean isValidate(TreeNode root){
         return helper(root,null,null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high){
        if (node == null) {
            return true;
        }

        if ((low != null && node.val <= low) || (high != null && node.val >= high)) {
            return false;
        }

        return helper(node.left, low, node.val) && helper(node.right, node.val, high);

    }
}
