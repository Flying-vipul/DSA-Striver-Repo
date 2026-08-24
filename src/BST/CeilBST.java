package BST;

public class CeilBST {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left= null;
            this.right=null;
        }
    }

    public int method(TreeNode root, int val){

        int ceil =-1;

        TreeNode ref = root;

        while(ref!=null){
            if (ref.val == val){
                return ref.val;
            }
            if (ref.val>val){
                ceil = ref.val;
                ref=ref.left;
            }else{
                ref =ref.right;
            }
        }
        return ceil;
    }
}
