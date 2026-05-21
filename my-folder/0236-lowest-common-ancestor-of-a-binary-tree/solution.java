/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode result;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q)
        return root;
        TreeNode leftSub=lowestCommonAncestor(root.left,p,q);
        TreeNode rightSub=lowestCommonAncestor(root.right,p,q);
        if(leftSub==null)
        return rightSub;
        if(rightSub==null)
        return leftSub;
        return root;
    }
    
    
}
