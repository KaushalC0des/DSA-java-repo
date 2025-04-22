// FlattenTree class definition
class FlattenTree {
    int val;
    FlattenTree left, right;

    FlattenTree(int val) {
        this.val = val;
    }
}

public class Flatten {

    // Class-level pointer to keep track of previous node
    private static FlattenTree prev = null;

    // Recursive function to flatten the tree
    public static void flatten(FlattenTree root) {
        if (root == null) return;

        // Reverse pre-order: right -> left -> root
        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    // Helper function to print the flattened tree
    public static void printRightSkewed(FlattenTree root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        /*
            Construct the tree:
                1
               / \
              2   5
             / \   \
            3   4   6
        */
        FlattenTree root = new FlattenTree(1);
        root.left = new FlattenTree(2);
        root.right = new FlattenTree(5);
        root.left.left = new FlattenTree(3);
        root.left.right = new FlattenTree(4);
        root.right.right = new FlattenTree(6);

        flatten(root); // Flatten the binary tree

        System.out.println("Flattened tree (right-skewed):");
        printRightSkewed(root); // Output: 1 2 3 4 5 6
    }
}

