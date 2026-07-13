package Trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
            helper(root,ans);
            return ans;
    }

    public void helper(TreeNode node, List<Integer> ans){
        if (node == null){
            return;
        }
        ans.add(node.val);
        helper(node.left,ans);
        helper(node.right,ans);
    }
}
