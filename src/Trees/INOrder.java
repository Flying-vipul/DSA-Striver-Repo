package Trees;

import java.util.ArrayList;
import java.util.List;

public class INOrder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }

    public void helper(TreeNode node, List<Integer> ans){
        if (node == null){
            return;
        }
        helper(node.left,ans);
        ans.add(node.val);
        helper(node.right,ans);
    }


}
