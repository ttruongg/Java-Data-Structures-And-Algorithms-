public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        myLinkedList.append(3);
        myLinkedList.append(5);
        myLinkedList.append(6);

        //myLinkedList.removeLast();
        myLinkedList.prepend(2);
        //myLinkedList.removeFirst();

        myLinkedList.set(3, 9);
        myLinkedList.insert(3, 10);
        myLinkedList.remove(3);

        myLinkedList.printList();

    }


}