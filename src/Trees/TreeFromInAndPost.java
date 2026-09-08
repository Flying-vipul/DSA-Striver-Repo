package Trees;

import java.util.HashMap;
import java.util.Map;

public class TreeFromInAndPost {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i< inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(inorder,0, inorder.length-1,postorder,0, postorder.length-1,map );

    }

    public TreeNode build(int[] inorder,int inStart , int inEnd , int[] postOrder , int postStart , int postEnd ,Map<Integer,Integer> map){

        if (inStart > inEnd || postStart > postEnd) return null;

        TreeNode root = new TreeNode(postOrder[postEnd]);
        int inRoot = map.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = build(inorder, inStart, inRoot - 1, postOrder, postStart, postStart + numsLeft - 1, map);
        root.right = build(inorder, inRoot + 1, inEnd, postOrder, postStart + numsLeft, postEnd - 1, map);

        return root;
    }


}
