package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BoundryTraversal {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public TreeNode(int val) {
            this.val=val;
        }
    }
    public boolean isLeaf(TreeNode node){
        return node.left != null || node.right != null;
    }
    public void leftTraversal(TreeNode node, List<Integer> res){

        TreeNode curr = node.left;
        while(curr!=null){
            if (!isLeaf(curr)) res.add(curr.val);
            if (curr.left!=null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
    }

    public void leafsTraversal(TreeNode node, List<Integer> res){
        if (isLeaf(node)){
            res.add(node.val);
            return;
        }
        if (node.left!=null) leafsTraversal(node.left,res);
        if (node.right!=null) leafsTraversal(node.right,res);
    }

    public void rightTraversal(TreeNode node, List<Integer> res){
        List<Integer> temp = new ArrayList<>();
        TreeNode curr = node.right;
        while(curr!=null){
            if (!isLeaf(curr)) temp.add(curr.val);
            if (curr.right!=null) curr=curr.right;
            else curr=curr.left;
        }
        for (int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }

    public List<Integer> boundaryTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root==null) return ans;
        leftTraversal(root,ans);
        leafsTraversal(root,ans);
        rightTraversal(root,ans);

        return ans;
    }

}
