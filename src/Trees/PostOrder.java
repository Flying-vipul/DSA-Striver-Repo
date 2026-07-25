package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data, TreeNode left, TreeNode right){
            this.data= data;
            this.left=left;
            this.right=right;
        }
        public TreeNode(){};
        public TreeNode(int data){
            this.data=data;
        }
    }

     public List<Integer> postorderTraversal(TreeNode node) {

        List<Integer> ans = new ArrayList<>();
        helper(node,ans);
        return ans;
    }

    public void helper(TreeNode node,List<Integer> ans){
        if (node == null){
            return;
        }

        helper(node.left,ans);
        helper(node.right,ans);
        ans.add(node.data);
    }
}
