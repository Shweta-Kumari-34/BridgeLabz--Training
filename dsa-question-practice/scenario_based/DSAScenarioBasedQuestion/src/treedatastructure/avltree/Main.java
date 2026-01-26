package treedatastructure.avltree;

public class Main {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        // gaming leaderboard / ticket time / patient time
        tree.root = tree.insert(tree.root, 50, "player a");
        tree.insert(tree.root, 30, "player b");
        tree.insert(tree.root, 70, "player c");
        tree.insert(tree.root, 20, "player d");
        tree.insert(tree.root, 40, "player e");

        System.out.println("sorted order:");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 30);

        System.out.println("after deletion:");
        tree.inorder(tree.root);
    }
}

