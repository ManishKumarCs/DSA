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
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> list=new ArrayList<Integer>();
//         Stack<TreeNode> stack=new Stack<>();
//         while(root!=null || !stack.isEmpty())
//         {
//             while(root!=null)
//             {
//                 stack.push(root);
//                 root=root.left;
//             }
//             root=stack.pop();
//             list.add(root.val);
//             root=root.right;
//         }
//         return list;       
//     }
// }


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorderTraversal(root,list);
    }
    public List<Integer> inorderTraversal(TreeNode root, List list){
        if(root!=null){
            inorderTraversal(root.left,list);
            list.add(root.val);
            inorderTraversal(root.right,list);
        }
        return list;
    }
}