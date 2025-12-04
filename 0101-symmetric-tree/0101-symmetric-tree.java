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
    public boolean isSymmetric(TreeNode root) {
        return inorder(root.left,root.right);
    }
    public boolean inorder(TreeNode l, TreeNode r){
        if(l==null && r==null) return true;
        if(l==null || r==null || l.val!=r.val) return false;
        return inorder(l.left,r.right) && inorder(l.right,r.left);

    }
}