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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0)return null;
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            insertNode(root,preorder[i]);
        }
        return root;
    }
    public TreeNode insertNode(TreeNode root, int val){
        if(root==null){
            root = new TreeNode(val);
            return root;
        }
        if(root.val>val){
            root.left = insertNode(root.left,val);
        }else{
            root.right = insertNode(root.right, val);
        }
        return root;
    }
}