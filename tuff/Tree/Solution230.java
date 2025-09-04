import java.util.PriorityQueue;

//   Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution230 {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public int kthSmallest(TreeNode root, int k) {

        traverse(root);
        for (int i = 0; i < k; i++) {
            pq.poll();
        }
        return pq.peek();
    }

    void traverse(TreeNode link) {
        if (link == null)
            return;
        traverse(link.left);
        traverse(link.right);
        pq.add(link.val);
    }

}