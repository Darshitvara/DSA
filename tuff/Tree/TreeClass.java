
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
        
        
        

    }

}
