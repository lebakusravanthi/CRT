import java.util.LinkedList;
import java.util.Queue;
public class TreeTraversals {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);  
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) { 
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
    public static void main(String[] args) {
        TreeTraversals tree = new TreeTraversals();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("Inorder: ");
        tree.inorder(root);
        System.out.println();
        System.out.print("Preorder: ");
        tree.preorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        tree.postorder(root);
        System.out.println();
        System.out.print("Level Order: ");
        tree.levelOrder(root);
    }
}
