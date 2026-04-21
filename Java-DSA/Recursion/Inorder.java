// Q16 get power of two 

import java.util.ArrayList;
import java.util.List;


public class Inorder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
        void inorder(TreeNode root, List<Integer> result) {
        if(root == null){
        return;
        }

        inorder(root.left , result);
        result.add(root.val);      
        inorder(root.right , result);

    }
}


