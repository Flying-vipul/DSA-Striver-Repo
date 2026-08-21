package Trees;

import java.util.ArrayList;
import java.util.List;

public class rootToNode {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }


    public static boolean getPath(TreeNode root, List<Integer> ans, int x){
        if (root == null) return false;

        ans.add(root.val);
        if (root.val == x){
            return true;
        }
        if (getPath(root.left,ans,x) || getPath(root.right,ans,x)){
            return true;
        }

        ans.removeLast();
        return false;

    }

    public static List<Integer> solve(TreeNode root,int x) {

        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        getPath(root, ans, x);
        return ans;
    }

    static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(3);
        root.left=rootLeft;
        root.right=rootRight;
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        rootLeft.left = c;
        rootLeft.right=d;
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        d.left=e;
        d.right=f;

        List<Integer> ans = solve(root,7);
        System.out.println(ans);
    }

}
