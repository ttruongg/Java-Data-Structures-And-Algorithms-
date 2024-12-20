import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeElementTest {
//    @BeforeEach
//    public void runMain() {
//        Main.main(new String[0]);
//    }

    // Test with an array containing the element to be removed
    @Test
    public void testRemoveElementWithTarget() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expected = 2; // After removal, length = 2
        int actual = Main.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    // Test with an array not containing the element to be removed
    @Test
    public void testRemoveElementWithoutTarget() {
        int[] nums = {1, 2, 3, 4};
        int val = 5;
        int expected = 4; // No removal, length = 4
        int actual = Main.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    // Test with an empty array
    @Test
    public void testRemoveElementEmptyArray() {
        int[] nums = {};
        int val = 3;
        int expected = 0; // Empty array, length = 0
        int actual = Main.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    // Test with an array of identical elements matching the target
    @Test
    public void testRemoveElementAllIdentical() {
        int[] nums = {2, 2, 2, 2};
        int val = 2;
        int expected = 0; // All removed, length = 0
        int actual = Main.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    // Test with an array containing a single element
    @Test
    public void testRemoveElementSingleElement() {
        int[] nums = {1};
        int val = 1;
        int expected = 0; // Single element removed, length = 0
        int actual = Main.removeElement(nums, val);
        assertEquals(expected, actual);

    }
}