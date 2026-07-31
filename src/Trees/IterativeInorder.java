package Trees;

import java.time.temporal.Temporal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class IterativeInorder {

    class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){};
        public TreeNode(int val){
            this.val=val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public List<Integer> inorder(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while(curr!=null || !stack.isEmpty()){

            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            curr = stack.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }


}
