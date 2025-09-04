import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    TreeNode root;
    int index = -1;

    BinaryTree() {
        root = null;
    }

    // Helper function to calculate height and diameter
    class TreeInfo{
        int height;
        int diaMeter;
        TreeInfo(int height, int diaMeter){
            this.height = height;
            this.diaMeter = diaMeter;
        }
    }

    // Function to calculate height and diameter
    public TreeInfo calculateHeightAndDiameter(TreeNode root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo leftInfo = calculateHeightAndDiameter(root.left);
        TreeInfo rightInfo = calculateHeightAndDiameter(root.right);

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        int diameter = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diaMeter, rightInfo.diaMeter));

        return new TreeInfo(height, diameter);
    }

    public TreeNode buildTree(int n[]){

        index++;
        if(n[index] == -1){
            return null;
        }

        TreeNode newNode = new TreeNode(n[index]);
        newNode.left = buildTree(n);
        newNode.right = buildTree(n);

        return newNode;


    }

    public void preOrder(TreeNode root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " " );
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    }

    public int countNodes(TreeNode root){
        if(root == null) return 0;

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    public int sumOfNodes(TreeNode root){
        if(root == null) return 0;

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public int heightOfTree(TreeNode root){
        if(root == null) return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }



}

public class TreeClass {
    // Tree implementation
    public static void main(String[] args) {
        int n[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(n);

        System.out.println("Preorder traversal:");
        tree.preOrder(root);
        System.out.println();
        System.out.println("Inorder traversal:");
        tree.inOrder(root);
        System.out.println();
        System.out.println("Postorder traversal:");
        tree.postOrder(root);
        System.out.println();

        System.out.println("Level order traversal:");
        tree.levelOrder(root);

        System.out.println("Count of nodes: " + tree.countNodes(root));

        System.out.println("Sum of all nodes: " + tree.sumOfNodes(root));

        System.out.println("Height of tree: " + tree.heightOfTree(root));

        BinaryTree.TreeInfo treeInfo = tree.calculateHeightAndDiameter(root);
        System.out.println("Height of tree (using TreeInfo): " + treeInfo.height);
        System.out.println("Diameter of tree (using TreeInfo): " + treeInfo.diaMeter);

    }

}
