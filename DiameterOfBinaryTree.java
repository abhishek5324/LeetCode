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
    class Pair<T,V>{
        T height;
        V diameter;
    }
    
     public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diameter;
    }
    
    public Pair<Integer,Integer> helper(TreeNode root) {
        if(root == null)
        {
            Pair<Integer,Integer> p = new Pair<>();
            p.height = 0;
            p.diameter = 0;
            return p;
        }
        
        Pair<Integer,Integer> l = helper(root.left);
        Pair<Integer,Integer> r = helper(root.right);
        int height = 1+ Math.max(l.height,r.height);
        int option1 = l.height + r.height;
        int option2 = l.diameter;
        int option3 = r.diameter;
        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> p = new Pair<>();
        p.height = height;
        p.diameter = diameter;
        return p;
        
    }
}