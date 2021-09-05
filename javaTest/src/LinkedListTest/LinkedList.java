package LinkedListTest;

public class LinkedList {

    private Node firstNode;
    public LinkedList(Node node) {
        this.firstNode = node;
    }

    public void insertNodeIntoSortedList(Node newNode) {

        if(firstNode.getNextNode() == null) {
            if (firstNode.getData() > newNode.getData()) {
                newNode.setNextNode(firstNode);
                firstNode = newNode;
            } else if (firstNode.getData() <= newNode.getData()) {
                firstNode.setNextNode(newNode);
            }
        } else {
            Node currentNode = firstNode;
            while (currentNode != null){
                if (currentNode.getNextNode() == null) {
                    currentNode.setNextNode(newNode);
                    break;
                }
                if(currentNode.getData() < newNode.getData() && currentNode.getNextNode().getData() > newNode.getData()) {
                    newNode.setNextNode(currentNode.getNextNode());
                    currentNode.setNextNode(newNode);
                    break;
                }
                if(currentNode.getData() == newNode.getData()) {
                    newNode.setNextNode(currentNode.getNextNode());
                    currentNode.setNextNode(newNode);
                    break;
                }
                currentNode = currentNode.getNextNode();

            }
        }
    }

    public void deleteNode (Node node) {

        if(firstNode == node) {
            if(firstNode.getNextNode() == null) {
                firstNode = null;
            } else {
                firstNode = firstNode.getNextNode();
            }
        }

        Node currentNode = firstNode;
        while(currentNode != null) {
            if(currentNode.getNextNode() == node) {
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                break;
            }
            currentNode = currentNode.getNextNode();
        }
    }

    public void printLinkedList() {
        Node indexNode = firstNode;
        while(indexNode != null) {
            System.out.println(indexNode.getData());
            indexNode = indexNode.getNextNode();
        }
    }
}
