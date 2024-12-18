public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public Node findMiddleNode() {
        Node tmp = head;
        Node before = head;
        Node after = head;

        while (after != null && after.next != null) {
            before = before.next;
            after = after.next.next;
        }
        return before;
    }




}
