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
    public List<Integer> preorderTraversal(TreeNode root) {
        helperFun(root);
        return l1;
    }
    
    public void helperFun(TreeNode root){
        if(root==null)
        return;

        l1.add(root.val);
        helperFun(root.left);
        helperFun(root.right);
    }
}