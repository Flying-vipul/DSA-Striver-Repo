package Trees;

import java.util.*;

public class BurnBT {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    Map<TreeNode,TreeNode> map = new HashMap<>();

    public int burnTime(TreeNode root, TreeNode target){
        int time =0;
        preOrder(root,null);
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        visited.add(target);
        while(!q.isEmpty()){

            int currSize = q.size();
            for (int i=0;i<currSize;i++) {
                TreeNode currGet = q.poll();

                if (currGet.left != null && !visited.contains(currGet.left)) {
                    q.add(currGet.left);
                    visited.add(currGet.left);
                }
                if (currGet.right != null && !visited.contains(currGet.right)) {
                    q.add(currGet.right);
                    visited.add(currGet.right);
                }
                TreeNode parent = map.get(currGet);
                if (parent != null && !visited.contains(parent)) {
                    visited.add(parent);
                    q.add(parent);
                }
            }
            if (!q.isEmpty()){
                time++;
            }
        }

        return time;

    }

    public void preOrder(TreeNode current , TreeNode parent){

        if (current == null) return;

        if(parent != null){
            map.put(current,parent);
        }

        preOrder(current.left,current);
        preOrder(current.right,current);
    }
}
