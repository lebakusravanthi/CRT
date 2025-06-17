import java.util.*;
public class BinaryTreeOps2 {
    static class Node {
        int data;
        Node left, right;
        Node(int value) {
            data = value;
            left = right = null;
        }
    }
    public int countNonLeafNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
		
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null || current.right != null) {
                count++;
            }
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return count;
		
    }
    public static void main(String[] args) {
        BinaryTreeOps1 tree = new BinaryTreeOps1();
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.right.right = new Node(20);
        int nonLeafCount = tree.countNonLeafNodes(root);
		if (foundNode !=null) {  
		System.out.println("Value"+valueToSearch+" not found in the tree.");
	}
	else {
		System.out.println("Value"+valueToSearch+" not found in the tree.");
    }
}
}