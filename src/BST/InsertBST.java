package BST;

public class InsertBST {

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

    public TreeNode method(TreeNode root, int val){

        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode ref = root;
        while(true){
            if(val > ref.val){
                if(ref.right == null){
                    ref.right = new TreeNode(val);
                    break;
                }else{
                    ref = ref.right;
                }
            }else{
                if (ref.left==null){
                    ref.left= new TreeNode(val);
                    break;
                }else{
                    ref = ref.left;
                }
            }
        }
        return root;
    }
}
