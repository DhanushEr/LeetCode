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
    public List<Integer> postorderTraversal(TreeNode root) {
        help(root);
        return l1;
    }

    public void help(TreeNode root){
        if(root==null)
        return;

        help(root.left);
        help(root.right);
        l1.add(root.val);
    }
}