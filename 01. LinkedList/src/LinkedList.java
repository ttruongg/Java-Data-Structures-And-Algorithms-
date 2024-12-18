public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + this.head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public Node removeLast() {
        Node tmp = head;
        Node pre = head;
        if (length == 0) return null;

        while (tmp.next != null) {
            pre = tmp;
            tmp = tmp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return tmp;


    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node tmp = head;
        head = head.next;
        tmp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }

        return tmp;

    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;

        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp;
    }

    public boolean set(int index, int value) {
        Node tmp = get(index);

        if (tmp != null) {
            tmp.value = value;
            return true;
        }

        return false;


    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node tmp = get(index - 1);

        newNode.next = tmp.next;
        tmp.next = newNode;
        length++;


        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= length)
            return false;

        if (index == 0) {
            removeFirst();
            return true;
        }

        if (index == length - 1) {
            removeLast();
            return true;
        }

        Node pre = get(index - 1);
        Node tmp = get(index); // pre.next;

        pre.next = tmp.next;
        tmp.next = null;
        length--;
        return true;
    }


}
