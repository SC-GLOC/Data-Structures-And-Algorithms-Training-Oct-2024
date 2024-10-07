// Singly Linked List Implementation In Java

public class SinglyLinkedList {

    ListNode head;
    ListNode tail;
    int sizeOfSLL;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.sizeOfSLL = 0;
    }

    // Creating First Node In SLL

    public ListNode createFirstNode(String value) {

        if (head == null) {

            ListNode newNode = new ListNode(value);
            head = newNode;
            tail = newNode;
            sizeOfSLL++;
            System.out.println("Node Created At Head");
            return head;
        }
        System.out.println("Head Already Exists. Use Insert Methods");
        return null;
    }

    // Inserting Node At Head - TC - O(1), SC - O(1)

    public void insertNodeAtHead(String value) {

        if (head == null) {
            createFirstNode(value);
            return;
        }

        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        sizeOfSLL++;
        System.out.println("Node Inserted At Head");
    }

    /*
     * Inserting Node At Tail - TC - O(1) [ if tail pointer is present], else O(n)
     * SC - O(1)
     */

    public void insertNodeAtTail(String value) {

        if (head == null) {
            createFirstNode(value);
            return;
        }

        ListNode newNode = new ListNode(value);
        tail.next = newNode;
        tail = newNode;
        sizeOfSLL++;
        System.out.println("Node Inserted At Tail");

    }

    /*
     * Inserting Node At Any Given Position - TC - O(n)
     * SC - O(1)
     */

    public void insertNode(String value, int pos) {

        if (head == null) {
            createFirstNode(value);
            return;
        }

        if (pos < 1) {

            System.out.println("You Have Entered Invalid Position");

        } else if (pos > sizeOfSLL) {

            insertNodeAtTail(value);

        } else if (pos == 1) {
            insertNodeAtHead(value);

        } else {

            ListNode newNode = new ListNode(value);

            ListNode temp = head;

            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            ListNode nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
            sizeOfSLL++;

            System.out.println("Node Inserted At Position " + pos);
        }

    }

    // Displaying list TC- O(n) | SC- O(1)

    public void showList() {

        ListNode temp = head;

        while (temp != null) {

            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print("NULL \n");
    }

    // This Method Is For Checking The Linked List End Points After Insertion And
    // Deletion

    public void continuityCheck() {

        System.out.println("Head Node " + head.val);
        System.out.println("Head Node " + tail.val);
    }

    // Delete Node From Head TC - O(1)

    public void deleteNodeFromHead() {
        if (head == null) {

            System.out.println("Nothing To Delete");
        } else if (head.next == null) {

            head = null;
            tail = null;
            sizeOfSLL = 0;
            System.out.println("Last Node Of SLL Deleted From Head");
        } else {

            head = head.next;
            sizeOfSLL--;
            System.out.println("Node Deleted From Head");
        }
    }
    // Delete Node From Tail TC - O(n)

    public void deleteNodeFromTail() {
        if (head == null) {

            System.out.println("Nothing To Delete");
        } else if (head.next == null) {

            head = null;
            tail = null;
            sizeOfSLL = 0;
            System.out.println("Last Node Of SLL Deleted From Tail");
        } else {

            ListNode temp = head;
            for (int i = 1; i < sizeOfSLL - 1; i++) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
            sizeOfSLL--;
            System.out.println("Node Deleted From Tail");
        }
    }
    // Delete Node From Tail TC - O(n)

    public void deleteNodeFromAnyPosition(int pos) {
        if (head == null) {

            System.out.println("Nothing To Delete");
        } else if (head.next == null) {

            head = null;
            tail = null;
            sizeOfSLL = 0;
            System.out.println("Last Node Of SLL Deleted From Tail");
        } else if (pos < 0) {
            System.out.println("Invalid Position For Delete");
        } else if (pos >= sizeOfSLL) {
            deleteNodeFromTail();
        } else if (pos == 1 || pos == 0) {
            deleteNodeFromHead();
        }

        else {

            ListNode temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            sizeOfSLL--;
            System.out.println("Node Deleted From Position" + pos);
        }
    }

    public void reverseLinkedList() {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;

            if (nextNode != null) {
                nextNode = nextNode.next;
            }
        }

        head = prev;

    }

}