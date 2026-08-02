package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (){};
        public TreeNode (int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public List<List<Integer>> levelTraversal(TreeNode node){


        List<List<Integer>> ans = new ArrayList<>();
        if (node == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            int currSize = q.size();

            List<Integer> currList = new ArrayList<>();
            for (int i=0;i<currSize;i++){

                TreeNode currNode  = q.poll();

                assert currNode != null;
                currList.add(currNode.val);

                if (currNode.left!=null){
                    q.add(currNode.left);
                }

                if (currNode.right!=null){
                    q.add(currNode.right);
                }
            }
                ans.add(currList);
        }
        return ans;

    }
}
