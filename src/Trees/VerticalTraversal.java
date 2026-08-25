package Trees;

import java.util.*;

public class VerticalTraversal {

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
    class Tuple{
        TreeNode node;
        int row;
        int col;

        public Tuple(TreeNode root, int i, int i1) {
            this.node=root;
            this.row=i;
            this.col=i1;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple currTup = q.poll();
            TreeNode currNode  = currTup.node;
            int x = currTup.row;
            int y = currTup.col;

            if (!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(currNode.val);
            if (currNode.left!=null){
                q.offer(new Tuple(currNode.left,x-1,y+1));
            }
            if (currNode.right!=null){
                q.offer(new Tuple(currNode.right,x+1,y+1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer,PriorityQueue<Integer>> ts : map.values()){
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes:ts.values()){
                while(!nodes.isEmpty()){
                    list.getLast().add(nodes.poll());
                }
            }
        }
        return list;
    }
}
