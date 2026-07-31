package Trees;

import com.sun.source.tree.Tree;

public class IdenticalTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){}
        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public TreeNode(int val){
            this.val=val;
        }
    }

    public boolean identical(TreeNode p, TreeNode q){
        if (p==null || q==null) return (p==q);

        return (p.val==q.val) && identical(p.left,q.left) && identical(p.right,q.right);
    }
}
