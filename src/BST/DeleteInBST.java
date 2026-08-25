package BST;

public class DeleteInBST {

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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }

        if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else if(root.val  < key){
            root.right = deleteNode(root.right,key);
        }else{
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            TreeNode succesor = findMin(root.right);
            root.val = succesor.val;

            root.right=deleteNode(root.right,succesor.val);
        }

        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
