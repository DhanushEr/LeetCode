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
    long prev=Long.MIN_VALUE;
    boolean var=true;
    public boolean isValidBST(TreeNode root) {
        help(root);
        return var;
    }

    public void help(TreeNode root){
        if(root==null){
            return;
        }

        help(root.left);
        if(prev>=root.val){
            var=false;
        }
        prev=root.val;
        help(root.right);
    }
}