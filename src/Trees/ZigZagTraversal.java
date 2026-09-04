package Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class ZigZagTraversal {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
        public TreeNode(){}
    }

    public List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            List<Integer> currList = new LinkedList<>();

            int currSize = queue.size();

            for (int i=0;i<currSize;i++){
                TreeNode get = queue.poll();
                assert get != null;
                if (leftToRight){
                    currList.addLast(get.val);
                }else{
                    currList.addFirst(get.val);
                }

                if (get.left!=null){
                    queue.add(get.left);
                }
                if (get.right!=null){
                    queue.add(get.right);
                }
            }
            leftToRight = !leftToRight;
            ans.add(currList);
        }
        return ans;
    }
}
