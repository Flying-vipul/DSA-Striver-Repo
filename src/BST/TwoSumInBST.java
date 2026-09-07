package BST;

import Recursion.ClimbStairs;

import java.util.ArrayList;
import java.util.List;

public class TwoSumInBST {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public boolean method(TreeNode root, int k){

        if(root == null){
            return false;
        }

        List<Integer> ans = new ArrayList<>();

        helper(root,ans);

        int left =0;
        int right =ans.size()-1;

        while (left<right){
            int currentSum = ans.get(left)+ans.get(right);
            if (currentSum==k){
                return true;
            } else if (currentSum<k) {
                left++;
            }else {
                right--;
            }
        }

        return false;

    }

    public List<Integer> helper(TreeNode root, List<Integer> list){
        if (root.left == null) return list;

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);

        return list;

    }

}
