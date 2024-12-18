package main;

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

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public void makeEmpty() {
        this.head = null;
        this.tail = null;
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


    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) return true;
        }

        return false;
    }


}
