// 543. Diameter of Binary Tree
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given the root of a binary tree, return the length of the diameter of the tree.

// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// The length of a path between two nodes is represented by the number of edges between them.

 

// Example 1:


// Input: root = [1,2,3,4,5]
// Output: 3
// Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
// Example 2:

// Input: root = [1,2]
// Output: 1
 

// Constraints:

// The number of nodes in the tree is in the range [1, 104].
// -100 <= Node.val <= 100

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
    class TreeInfo{
        int ht;
        int dm;
        TreeInfo(int h, int d){
            this.ht = h;
            this.dm = d;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo result = getDiameter(root);
        return result.dm ;
    }
    public TreeInfo getDiameter(TreeNode root){
        if(root == null) return new TreeInfo(0,0);

        TreeInfo l = getDiameter(root.left);
        TreeInfo r = getDiameter(root.right);

        int height = Math.max(l.ht, r.ht) + 1;

        int d1 = l.dm;
        int d2 = r.dm;
        int d3 = l.ht + r.ht;

        int diameter = Math.max(d3,Math.max(d2,d1)) ;

        TreeInfo newInfo = new TreeInfo(height,diameter);

        return newInfo;
    }
}