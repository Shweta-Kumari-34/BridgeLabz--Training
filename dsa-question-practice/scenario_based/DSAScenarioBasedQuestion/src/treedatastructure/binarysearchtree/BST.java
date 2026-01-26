package treedatastructure.binarysearchtree;

public class BST {

	Node root;

	// insert node
	Node insert(Node root, int key, String data) {
		if (root == null)
			return new Node(key, data);

		if (key < root.key)
			root.left = insert(root.left, key, data);
		else if (key > root.key)
			root.right = insert(root.right, key, data);

		return root;
	}

	// search node
	Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;

		if (key < root.key)
			return search(root.left, key);

		return search(root.right, key);
	}

	// inorder (sorted)
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.key + " -> " + root.data);
			inorder(root.right);
		}
	}

	// delete node
	Node delete(Node root, int key) {
		if (root == null)
			return null;

		if (key < root.key)
			root.left = delete(root.left, key);
		else if (key > root.key)
			root.right = delete(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			root.key = minValue(root.right);
			root.right = delete(root.right, root.key);
		}
		return root;
	}

	int minValue(Node root) {
		while (root.left != null)
			root = root.left;

		return root.key;
	}
}
