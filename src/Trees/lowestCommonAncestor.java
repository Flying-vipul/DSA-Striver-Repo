package Trees;

public class lowestCommonAncestor {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null||p==null||q==null){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left!=null && right!=null){
            return root;
        }

        return (left!=null)?left:right;
    }
}
