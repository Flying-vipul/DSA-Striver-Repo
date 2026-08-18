package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IterativePostOrder {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val,TreeNode left,TreeNode right){
            this.val = val;
            this.left=left;
            this.right=right;
        }
    }

    public List<Integer> post(TreeNode root){
        List<Integer> ans = new ArrayList<>();

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
        while(curr!=null || !stack.isEmpty()){

            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            TreeNode peekNode = stack.peek();
            if (peekNode.right!=null && peekNode.right!=lastVisited  ){
                curr = peekNode.right;
            }else{
                ans.add(peekNode.val);
                lastVisited = stack.pop();
            }

        }
        return ans;

    }


}
