package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class IterativePreOrder {

     class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){};
        public TreeNode(int val){
            this.val=val;
        }
        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public List<Integer> perOrder(TreeNode root){
         List<Integer> ans = new ArrayList<>();

         if (root == null) return ans;
         ArrayDeque<TreeNode> stack = new ArrayDeque<>();

         stack.push(root);
         while (!stack.isEmpty()){

             TreeNode get = stack.pop();
             ans.add(get.val);

             if (root.right!=null){
                 stack.push(root.right);
             }
             if (root.left!=null){
                 stack.push(root.left);
             }
         }
         return ans;
    }

}
