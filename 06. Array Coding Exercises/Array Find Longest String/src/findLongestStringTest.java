import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findLongestStringTest {
    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    // Test with an array of strings of varying lengths
    @Test
    public void testFindLongestStringVaryingLengths() {
        String[] stringList = {"apple", "banana", "cherry"};
        String expected = "banana";
        String actual = Main.findLongestString(stringList);
        assertEquals(expected, actual);
    }

    // Test with an array of strings with the same length
    @Test
    public void testFindLongestStringSameLength() {
        String[] stringList = {"cat", "dog", "bat"};
        String expected = "cat"; // First longest string
        String actual = Main.findLongestString(stringList);
        assertEquals(expected, actual);
    }

    // Test with an empty array
    @Test
    public void testFindLongestStringEmptyArray() {
        String[] stringList = {};
        String expected = "";
        String actual = Main.findLongestString(stringList);
        assertEquals(expected, actual);
    }

    // Test with an array containing a single string
    @Test
    public void testFindLongestStringSingleElement() {
        String[] stringList = {"hello"};
        String expected = "hello";
        String actual = Main.findLongestString(stringList);
        assertEquals(expected, actual);
    }

    // Test with an array containing empty strings
    @Test
    public void testFindLongestStringEmptyStrings() {
        String[] stringList = {"", "", ""};
        String expected = ""; // As all are empty strings
        String actual = Main.findLongestString(stringList);
        assertEquals(expected, actual);
    }
}