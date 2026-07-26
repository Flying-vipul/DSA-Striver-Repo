package Trees;

public class maxPathSum {



      public class TreeNode {
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

     int maxSum;
     public int maxPath(TreeNode root){
          maxSum = Integer.MIN_VALUE;
          dfs(root);
          return maxSum;
     }

     public int dfs(TreeNode node){
         if (node == null) return 0;

         int leftMax = Math.max(dfs(node.left),0);
         int maxRight = Math.max(dfs(node.right),0);

         int currentSum = Math.max(leftMax,maxRight);
         maxSum = Math.max(currentSum,maxSum);
         return node.val+Math.max(leftMax,maxRight);
     }

}
