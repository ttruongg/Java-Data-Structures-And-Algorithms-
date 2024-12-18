package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMiddleNodeTest {

    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    // Test an empty list
    public void testFindMiddleEmpty() {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();  // Make list empty
        assertNull(ll.findMiddleNode());
    }

    @Test
    // Test list with 1 element
    public void testFindMiddleOneElement() {
        LinkedList ll = new LinkedList(1);
        assertEquals(1, ll.findMiddleNode().value);
    }

    @Test
    // Test list with odd number of elements
    public void testFindMiddleOddElements() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        assertEquals(3, ll.findMiddleNode().value);
    }

    @Test
    // Test list with even number of elements
    public void testFindMiddleEvenElements() {
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        assertEquals(4, ll.findMiddleNode().value);
    }

}