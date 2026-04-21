// Q16 get power of two 

import java.util.ArrayList;
import java.util.List;


public class Preorder {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

     public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        System.out.println(result);
        return result;
    }
        void preorder(TreeNode root, List<Integer> result) {
        if(root == null){
        return;
        }

        result.add(root.val);      
        preorder(root.left , result);
        preorder(root.right , result);

    }
}


