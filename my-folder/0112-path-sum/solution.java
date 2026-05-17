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
    boolean leftside=false;
    boolean rightside=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        if(root.left==null && root.right==null && root.val==targetSum)
        return true;
        if(root.left!=null)      
         leftside=hasPathSum(root.left,targetSum-root.val);
         if(root.right!=null)
            rightside=hasPathSum(root.right,targetSum-root.val);

        return leftside || rightside;

    }
}
