package LinkedListTest;

public class LinkedListDriver {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node2dup = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node4dup = new Node(4);

        /*node1.addNode(node2);
        node2.addNode(node3);
        node3.addNode(node4);*/
        LinkedList linkedList = new LinkedList(node1);
        linkedList.insertNodeIntoSortedList(node3);
        linkedList.insertNodeIntoSortedList(node2);
        linkedList.insertNodeIntoSortedList(node4);
        linkedList.insertNodeIntoSortedList(node2dup);
        linkedList.insertNodeIntoSortedList(node4dup);
        linkedList.printLinkedList();
        System.out.println("Delete");
        linkedList.deleteNode(node4dup);
        linkedList.printLinkedList();
        System.out.println("Delete");
        linkedList.deleteNode(node4dup);
        linkedList.printLinkedList();
        System.out.println("Delete");
        linkedList.deleteNode(node1);
        linkedList.printLinkedList();


    }


}
