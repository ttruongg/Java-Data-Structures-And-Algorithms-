import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeDuplicateTest {
    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }


    // Test with an array containing duplicates
    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int expected = 4; // Unique elements are 1, 2, 3, 4
        int actual = Main.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    // Test with an array containing no duplicates
    @Test
    public void testRemoveDuplicatesNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = Main.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    // Test with an empty array
    @Test
    public void testRemoveDuplicatesEmptyArray() {
        int[] nums = {};
        int expected = 0;
        int actual = Main.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    // Test with an array containing a single element
    @Test
    public void testRemoveDuplicatesSingleElement() {
        int[] nums = {1};
        int expected = 1;
        int actual = Main.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

    // Test with an array containing all identical elements
    @Test
    public void testRemoveDuplicatesAllIdentical() {
        int[] nums = {3, 3, 3, 3};
        int expected = 1; // Unique element is 3
        int actual = Main.removeDuplicates(nums);
        assertEquals(expected, actual);
    }
}