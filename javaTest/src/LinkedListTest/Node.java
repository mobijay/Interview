package LinkedListTest;

public class Node {
    private Node next;
    private int data;

    public Node(int data) {
        next = null;
        this.data = data;
    }

    public Node getNextNode() {
        return next;
    }

    public void setNextNode(Node node) {
        next = node;
    }

    public int getData() {
        return data;
    }

}
