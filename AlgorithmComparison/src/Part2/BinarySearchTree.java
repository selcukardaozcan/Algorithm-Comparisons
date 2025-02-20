package Part2;

public class BinarySearchTree {

    private class Node {
        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    private Node root;

    // Insert a key into the BST
    public void put(int key) {
        root = putHelper(root, key);
    }

    // Recursive helper method for inserting a node into the BST
    private Node putHelper(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = putHelper(root.left, key);
        } else if (key > root.key) {
            root.right = putHelper(root.right, key);
        }
        return root;
    }

    // Display the BST in in order traversal
    public void display() {
        displayHelper(root);
    }

    // Recursive helper method for in order traversal of the BST
    private void displayHelper(Node root) {
        if (root != null) {
            // Traverse the left subtree first
            displayHelper(root.left);
            // Visit the root node
            System.out.println("Key: " + root.key);
            // Traverse the right subtree
            displayHelper(root.right);
        }
    }

    // Check if a key exists in the BST
    public boolean get(int key) {
        return getHelper(root, key);
    }

    // Recursive helper method for checking if a key exists
    private boolean getHelper(Node root, int key) {
        if (root == null) {
            return false; // Key not found
        }
        if (key < root.key) {
            return getHelper(root.left, key);
        } else if (key > root.key) {
            return getHelper(root.right, key);
        } else {
            return true; // Key found
        }
    }


}
