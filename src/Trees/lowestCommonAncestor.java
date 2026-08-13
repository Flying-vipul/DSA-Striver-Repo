package Trees;

import com.sun.source.tree.Tree;


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

    public  TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

       if (root == null || root==p || root==q){
           return root;
       }

       TreeNode left = lca(root.left,p,q);
       TreeNode right = lca(root.right,p,q);

       if (left!= null && right != null){
           return root;
       }

       return (left!=null)?left:right;
    }
}
