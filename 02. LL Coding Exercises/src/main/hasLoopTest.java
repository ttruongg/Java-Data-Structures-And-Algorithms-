package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hasLoopTest {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testHasLoopWithEmptyListReturnsFalse() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        assertFalse(ll.hasLoop());
    }

    @Test
    public void testHasLoopWithOneElementReturnsFalse() {
        LinkedList ll = new LinkedList(1);
        assertFalse(ll.hasLoop());
    }

    @Test
    public void testHasLoopWithNoLoopReturnsFalse() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        assertFalse(ll.hasLoop());
    }


    // Helper method to create a loop in the first half of the linked list
    public void createPartialLoop(LinkedList list) {
        list.getHead().next.next.next = list.getHead().next;
    }

    @Test
    public void testHasLoopWithLoopReturnsTrue() {
        // Create a linked list with 8 elements
        LinkedList longList = new LinkedList(1);
        for (int i = 2; i <= 8; i++) {
            longList.append(i);
        }

        // Create a loop in the first half of the list
        createPartialLoop(longList);

        // Create a new list that will represent the second half, no loop
        LinkedList secondHalf = new LinkedList(5);
        secondHalf.append(6);
        secondHalf.append(7);
        secondHalf.append(8);

        // Check if hasLoop returns true for the first half with a loop
        assertTrue(longList.hasLoop());

        // Check if hasLoop returns false for the second half without a loop
        assertFalse(secondHalf.hasLoop());
    }
}