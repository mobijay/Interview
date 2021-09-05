package BinaryTree;

public class BinaryTreeHelper {

    private Node currentNode;
    private Node rootNode;

    public BinaryTreeHelper(Node rootNode) {
        this.currentNode = rootNode;
        this.rootNode = rootNode;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public Node insert(int data) {

        if(currentNode.getData() < data) {
            if(currentNode.getRightNode() == null) {
                currentNode.setRightNode(new Node(data));
            } else {
                currentNode = currentNode.getRightNode();
                insert(data);
            }
        } else if(currentNode.getData() > data) {
            if(currentNode.getLeftNode() == null) {
                currentNode.setLeftNode(new Node(data));
            } else {
                currentNode = currentNode.getLeftNode();
                insert(data);
            }

        }

        currentNode = rootNode;
        return currentNode;
    }

    public void traverse(Node rootNode) {

        if(rootNode != null) {
            traverse(rootNode.getLeftNode());
            System.out.println(rootNode.getData());
            traverse(rootNode.getRightNode());
        }

    }
}
