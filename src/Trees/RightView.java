package Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class RightView {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class Pair {
        TreeNode node;
        int level;
        public Pair(TreeNode  node, int level){
            this.node=node;
            this.level=level;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        if (root==null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair currPair = q.poll();
            TreeNode currNode = currPair.node;
            int currLevel = currPair.level;

            map.put(currLevel,currNode.val);

            if (currNode.left!=null){
                q.offer(new Pair(currNode.left,currLevel+1));
            }
            if (currNode.right!=null){
                q.offer(new Pair(currNode.right,currLevel+1));
            }
        }
        for (Map.Entry<Integer,Integer> ele: map.entrySet()){
            ans.add(ele.getValue());
        }
        return ans;
    }
}
