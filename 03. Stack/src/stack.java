public class stack {
    private int height;
    private Node top;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        this.height = 1;
    }

    public void getHeight() {
        System.out.println("Height: " + this.height);
    }

    public void getTop() {
        System.out.println("Top: " + this.top.value);
    }

    public void printStack() {
        Node tmp = top;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0) {
            top = null;
        }
        Node tmp = top;
        top = top.next;
        tmp.next = null;
        height--;

        return tmp;
    }
}
