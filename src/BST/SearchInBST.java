package BST;

public class SearchInBST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public TreeNode searchBST(TreeNode root,int val){
        if (root == null || root.val ==val){
            return root;
        }

        if(val < root.val){
            return searchBST(root.left,val);
        }

        return searchBST(root.right,val);
    }


}
