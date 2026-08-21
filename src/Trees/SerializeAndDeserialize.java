package Trees;

import java.util.Objects;

public class SerializeAndDeserialize {


    class TreeNode {
        int val;
        TreeNode left ;
        TreeNode right;

        public TreeNode(int val){
            this.val=val;
            this.left= null;
            this.right=null;
        }
    }

    public String serialize(TreeNode root){

        StringBuilder str = new StringBuilder();
        if (root == null) return str.toString();
        helper(root,str);

        return str.toString();

    }

    public void helper(TreeNode root, StringBuilder str){
        if (root == null) {
            str.append("null");
            str.append(",");
            return;
        }
        str.append(root.val);
        str.append(",");
        if (root.left != null){
            helper(root.left,str);
        }else{
            str.append("null");
            str.append(",");
        }

        if(root.right != null){
            helper(root.right,str);
        }else{
            str.append("null");
            str.append(",");
        }

    }


    public TreeNode deserialize(String str){

        if (str.isEmpty()){
            return null;
        }

       String[] str2 = str.split(",");
        index =0;
        return build(str2);
    }

    int index =0;
    public TreeNode build(String[] values){

        String value = values[index++];

        if (Objects.equals(value, "null")) {
            return null;
        }
        TreeNode newNode = new TreeNode(Integer.parseInt(value));
        newNode.left = build(values);
        newNode.right = build(values);

        return newNode;
    }

}
