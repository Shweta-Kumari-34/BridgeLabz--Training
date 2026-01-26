package treedatastructure.avltree;

public class AVLNode {
    int key;
    String data;
    int height;
    AVLNode left, right;

    public AVLNode(int key, String data) {
        this.key = key;
        this.data = data;
        height = 1;
    }
}
