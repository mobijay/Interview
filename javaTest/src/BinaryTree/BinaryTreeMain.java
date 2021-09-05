package BinaryTree;

public class BinaryTreeMain {

    public static void main(String[] args) {
        Node rootNode = new Node(5);
        BinaryTreeHelper binaryTreeHelper = new BinaryTreeHelper(rootNode);
        binaryTreeHelper.insert(3);
        binaryTreeHelper.insert(4);
        binaryTreeHelper.insert(2);
        binaryTreeHelper.insert(7);
        Node rootNodeTest = binaryTreeHelper.getRootNode();

        binaryTreeHelper.traverse(rootNode);
        System.out.println();
    }
}
