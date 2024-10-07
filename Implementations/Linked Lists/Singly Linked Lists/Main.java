public class Main {

    public static void main(String[] args) {

        SinglyLinkedList sll1 = new SinglyLinkedList();
        sll1.insertNodeAtHead("A");
        sll1.insertNodeAtHead("B");
        sll1.insertNodeAtHead("C");
        sll1.insertNodeAtHead("D");

        sll1.showList();
        sll1.continuityCheck();

        sll1.insertNodeAtTail("E");
        sll1.insertNodeAtTail("F");
        sll1.insertNodeAtTail("G");

        sll1.showList();
        sll1.continuityCheck();

        sll1.insertNode("I", 4);
        sll1.showList();
        sll1.continuityCheck();

        sll1.deleteNodeFromTail();
        sll1.showList();
        sll1.continuityCheck();
        sll1.deleteNodeFromHead();
        sll1.showList();
        sll1.continuityCheck();

        sll1.deleteNodeFromAnyPosition(5);
        sll1.showList();
        sll1.continuityCheck();
        sll1.deleteNodeFromAnyPosition(5);
        sll1.showList();
        sll1.continuityCheck();

        sll1.reverseLinkedList();
        sll1.showList();

    }

}
