package Trees;

import com.sun.source.tree.Tree;

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
        helper(node,ans);
        return ans;

    }

    public void helper(TreeNode node , List<List<Integer>> ans){
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            int levelNum = queue.size();

            List<Integer> newList = new ArrayList<>();
            for (int i=0;i<levelNum;i++){
                TreeNode get2 = queue.poll();
                assert get2 != null;
                newList.add(get2.val);
                if (get2.left != null){
                    queue.add(get2.left);
                }
                if (get2.right != null){
                    queue.add(get2.right);
                }
            }
            ans.add(newList);

        }
    }
}
