import java.util.*;
public class BinaryTreeOps {
    static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
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
        System.out.println();
    }
    int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right)); 
    }
    int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right); 
    }
    public static void main(String[] args) {
        BinaryTreeOps tree = new BinaryTreeOps();
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.right = new Node(20);
        tree.levelOrder(root);
        System.out.println("Height of tree: " + tree.height(root));
        System.out.println("Total no. of Nodes: " + tree.countNodes(root));
        System.out.println("Leaf Nodes: " + tree.countLeafNodes(root));
    }
}

