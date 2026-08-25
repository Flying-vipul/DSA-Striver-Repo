package BST;

public class FloorBST {

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

    public int method(TreeNode root, int val){
        int floor = -1;
        TreeNode ref = root;

        if (ref.val == val){
            return ref.val;
        }
        while(ref != null){
            if (ref.val > val){
                ref = ref.left;

            }else{
                floor=ref.val;
                ref =ref.right;
            }

        }
        return floor;
    }


}
