package treedatastructure.avltree;

public class AVLTree {

	AVLNode root;

	int height(AVLNode n) {
		return (n == null) ? 0 : n.height;
	}

	int getBalance(AVLNode n) {
		return (n == null) ? 0 : height(n.left) - height(n.right);
	}

	AVLNode rightRotate(AVLNode y) {
		AVLNode x = y.left;
		AVLNode t = x.right;

		x.right = y;
		y.left = t;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	AVLNode leftRotate(AVLNode x) {
		AVLNode y = x.right;
		AVLNode t = y.left;

		y.left = x;
		x.right = t;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// insert / update
	AVLNode insert(AVLNode node, int key, String data) {
		if (node == null)
			return new AVLNode(key, data);

		if (key < node.key)
			node.left = insert(node.left, key, data);
		else if (key > node.key)
			node.right = insert(node.right, key, data);
		else
			return node;

		node.height = 1 + Math.max(height(node.left), height(node.right));

		int balance = getBalance(node);

		// ll
		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		// rr
		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		// lr
		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// rl
		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// inorder (sorted)
	void inorder(AVLNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.key + " -> " + node.data);
			inorder(node.right);
		}
	}

	// delete
	AVLNode delete(AVLNode root, int key) {
		if (root == null)
			return null;

		if (key < root.key)
			root.left = delete(root.left, key);
		else if (key > root.key)
			root.right = delete(root.right, key);
		else {
			if (root.left == null || root.right == null)
				root = (root.left != null) ? root.left : root.right;
			else {
				AVLNode min = root.right;
				while (min.left != null)
					min = min.left;

				root.key = min.key;
				root.data = min.data;
				root.right = delete(root.right, min.key);
			}
		}

		if (root == null)
			return null;

		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int balance = getBalance(root);

		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}
}
