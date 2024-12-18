package main;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        //myLinkedList.getTail().next = myLinkedList.getHead().next;


        //myLinkedList.print();

        //System.out.println(myLinkedList.findMiddleNode().value);
        //System.out.println(myLinkedList.hasLoop());

        System.out.println(myLinkedList.findKthFromEnd(5).value);


    }
}