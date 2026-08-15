package Trees;

public class CBnodes {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int levelLeft1 = countLeft(root);
        int levelRight2 = countRight(root);

        if (levelLeft1 == levelRight2) return (1<<levelLeft1) -1;

        return 1+countNodes(root.left)+countNodes(root.right);
    }


    public int countLeft(TreeNode node){
        int count =0;
        if (node == null) return count;
        while (node!=null){
            count++;
            node = node.left;
        }
        return count;
    }

    public int countRight(TreeNode node){
        int count  =0;
        if (node == null) return count;
        while(node != null) {
            node = node.right;
        }
        return count;
    }
}
