import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class popMethodTest {
    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    @Test
    public void testPopFromEmptyStack() {
        // Create an empty stack
        Stack stack = new Stack<>();

        // Pop an element
        Integer poppedValue = (Integer) stack.pop();

        // Should return null and size should be 0
        assertNull(poppedValue);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopFromSingleElementStack() {
        // Create a single-element stack
        Stack stack = new Stack<>();
        stack.push(1);

        // Pop an element
        Integer poppedValue = (Integer) stack.pop();

        // Should return 1 and size should be 0
        assertEquals(Integer.valueOf(1), poppedValue);
        assertEquals(0, stack.size());
    }

    @Test
    public void testPopFromMultiElementStack() {
        // Create a multi-element stack
        Stack stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop an element
        Integer poppedValue = (Integer) stack.pop();

        // Should return 3 and size should be 2
        assertEquals(Integer.valueOf(3), poppedValue);
        assertEquals(2, stack.size());

        // Check the last element after popping
        assertEquals(Integer.valueOf(2), stack.peek());
    }
}