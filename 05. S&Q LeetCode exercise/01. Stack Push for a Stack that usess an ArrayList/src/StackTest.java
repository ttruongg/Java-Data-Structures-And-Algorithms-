import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testPushToEmptyStack() {
        // Create an empty stack
        Stack stack = new Stack<>();

        // Push a value and test
        stack.push(1);

        // Check size is 1
        assertEquals(1, stack.size());

        // Check the last element
        assertEquals(Integer.valueOf(1), stack.peek());
    }

    @Test
    public void testPushToSingleElementStack() {
        // Create a single-element stack
        Stack stack = new Stack<>();
        stack.push(1);

        // Push another value and test
        stack.push(2);

        // Check size is 2
        assertEquals(2, stack.size());

        // Check the last element
        assertEquals(Integer.valueOf(2), stack.peek());
    }

    @Test
    public void testPushToMultiElementStack() {
        // Create a multi-element stack
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        // Push another value and test
        stack.push(3);

        // Check size is 3
        assertEquals(3, stack.size());

        // Check the last element
        assertEquals(Integer.valueOf(3), stack.peek());
    }
}