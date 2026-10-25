package Heaps;

public class ll958 {


//      Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }
     }

    class  Solution {
        public boolean isCompleteTree(TreeNode root) {
            //count nodes
            int totalNodes = countNodes(root);

            return isCBT(root,0,totalNodes);
        }

        public boolean isCBT(TreeNode root, int index, int totalNodes){
            if (root==null) {
                return true;
            }

            if (index>=totalNodes) return false;

            boolean leftCheck = isCBT(root.left,(2*index+1),totalNodes);
            boolean rightCheck = isCBT(root.right,(2*index+2),totalNodes);
            return leftCheck&&rightCheck;


        }

        public int countNodes(TreeNode root){
            if(root==null) return 0;
            return 1+countNodes(root.left)+countNodes(root.right);
        }

    }
}
