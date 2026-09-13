package Trees;

import java.util.*;
import java.util.HashMap;

public class PrintNodeK {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    Map<TreeNode,TreeNode> map = new HashMap<>();
    public List<Integer> method(TreeNode root, TreeNode target, int k){

        List<Integer> ans = new ArrayList<>();
        preOrder(root,null);

        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(target);
        visited.add(target);
        int dis = 0;
        while(!q.isEmpty()){
            if (dis == k) break;
            int currSize = q.size();

                for (int i=0;i<currSize;i++){
                    TreeNode currGet = q.poll();

                    if (currGet.left!=null && !visited.contains(currGet)){
                        q.add(currGet.left);
                        visited.add(currGet.left);
                    }
                    if (currGet.right!=null && !visited.contains(currGet)){
                        q.add(currGet.right);
                        visited.add(currGet.right);
                    }

                    TreeNode parent = map.get(currGet);
                    if (parent!=null && !visited.contains(parent)){
                        q.add(parent);
                        visited.add(parent);
                    }
                }
            dis++;
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }

    public void preOrder(TreeNode current, TreeNode parent){
        if (current == null) return;

        if (parent!=null){
            map.put(current,parent);
        }

        preOrder(current.left,current);
        preOrder(current.right,current);
    }
}
