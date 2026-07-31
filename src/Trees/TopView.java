package Trees;

import java.util.*;

public class TopView {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    class Pair{
        TreeNode node;
        int line;
        public Pair(TreeNode node,int line){
            this.node=node;
            this.line=line;
        }
    }
    public List<Integer> topViewTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair currQ = q.poll();
            TreeNode currNode = currQ.node;
            int currLine = currQ.line;
            if (!map.containsKey(currLine)){
                map.put(currLine,currNode.val);
            }
            if (currNode.left!=null){
                q.offer(new Pair(currNode.left,currLine-1));
            }
            if (currNode.right!=null){
                q.offer(new Pair(currNode.right,currLine+1));
            }
        }
        for ( Map.Entry<Integer,Integer> ele: map.entrySet()){
            ans.add(ele.getValue());
        }

        return ans;
    }
}
