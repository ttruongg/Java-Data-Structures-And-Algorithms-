import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMaxMinTest {
//    @BeforeEach
//    public void runMain() {
//        Main.main(new String[0]);
//    }

    // Test with an array of mixed numbers
    @Test
    public void testFindMaxMinMixedNumbers() {
        int[] myList = {5, 1, 8, -3, 2};
        int[] expected = {8, -3}; // max = 8, min = -3
        int[] actual = Main.findMaxMin(myList);
        assertArrayEquals(expected, actual);
    }

    // Test with an array of all positive numbers
    @Test
    public void testFindMaxMinAllPositive() {
        int[] myList = {1, 2, 3, 4, 5};
        int[] expected = {5, 1}; // max = 5, min = 1
        int[] actual = Main.findMaxMin(myList);
        assertArrayEquals(expected, actual);
    }

    // Test with an array of all negative numbers
    @Test
    public void testFindMaxMinAllNegative() {
        int[] myList = {-1, -2, -3, -4, -5};
        int[] expected = {-1, -5}; // max = -1, min = -5
        int[] actual = Main.findMaxMin(myList);
        assertArrayEquals(expected, actual);
    }

    // Test with an array containing a single element
    @Test
    public void testFindMaxMinSingleElement() {
        int[] myList = {5};
        int[] expected = {5, 5}; // max = 5, min = 5
        int[] actual = Main.findMaxMin(myList);
        assertArrayEquals(expected, actual);
    }

    // Test with an array of all identical elements
    @Test
    public void testFindMaxMinIdentical() {
        int[] myList = {2, 2, 2, 2};
        int[] expected = {2, 2}; // max = 2, min = 2
        int[] actual = Main.findMaxMin(myList);
        assertArrayEquals(expected, actual);
    }
}