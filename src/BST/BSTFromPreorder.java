package BST;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BSTFromPreorder {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }


    public TreeNode build(int[] preOrder, int preStart, int preEnd,int[] inorder,  int inStart, int inEnd, Map<Integer,Integer> inMap){

        if (preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);

        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = build(preOrder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,inMap);
        root.right = build(preOrder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,inMap);

        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {

        int[] inorder = Arrays.copyOf(preorder,preorder.length);
        Arrays.sort(inorder);
        Map<Integer,Integer> inMap = new HashMap<>();

        for (int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }

        return build(preorder, 0,preorder.length-1, inorder,0,inorder.length-1,inMap);

    }

}
