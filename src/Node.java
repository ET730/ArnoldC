public class Node {
    Node left = null;
    Node right = null;
    byte value = 0;
    Node goLeft() {
        if (this.left == null) {
            this.left = new Node();
            this.left.right = this;
        }
        return this.left;
    }
    Node goRight() {
        if (this.right == null) {
            this.right = new Node();
            this.right.left = this;
        }
        return this.right;
    }
    char print () {
        return (char)value;
    }
    void insert(byte value) {
        this.value = value;
    }
    void inc() {
        this.value++;
    }
    void dec() {
        this.value--;
    }

}
