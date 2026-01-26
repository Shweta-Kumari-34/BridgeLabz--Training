package treedatastructure.binarysearchtree;

public class Main {

	public static void main(String[] args) {

		BST bst = new BST();

		// insertion operation
		bst.root = bst.insert(bst.root, 50, "student a");
		bst.insert(bst.root, 30, "student b");
		bst.insert(bst.root, 70, "student c");
		bst.insert(bst.root, 20, "student d");
		bst.insert(bst.root, 40, "student e");

		// search node
		Node result = bst.search(bst.root, 30);
		System.out.println("search result: " + result.data);

		// sorted display
		System.out.println("sorted records are:");
		bst.inorder(bst.root);

		// delete
		bst.root = bst.delete(bst.root, 30);

		System.out.println("after deletion:");
		bst.inorder(bst.root);
	}
}
