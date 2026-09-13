package BST;

public class Successor {


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
    // success der
   TreeNode result = null;
    public TreeNode method(TreeNode root, int target){

        while (root != null){

            if (root.val>target){
                result = root;
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return result;
    }

    TreeNode preceder = null;

    public TreeNode method2(TreeNode root, int target){

        while(root!=null){

            if (root.val>target){
                root = root.left;
            }else{
                preceder = root;
                root = root.right;
            }

        }
        return preceder;
    }
}
