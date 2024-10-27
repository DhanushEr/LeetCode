/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 
class Solution {
     List<Integer>l1=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       
        helperfun(root);
        return l1;
    }

    public void helperfun(TreeNode root){
        if(root==null){
            return;
        }

        helperfun(root.left);
        l1.add(root.val);
        helperfun(root.right);
    }
}