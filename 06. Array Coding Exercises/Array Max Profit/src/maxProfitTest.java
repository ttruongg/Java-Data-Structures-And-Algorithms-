import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxProfitTest {
    @BeforeEach
    public void runMain() {
        Main.main(new String[0]);
    }

    // Test with an array of ascending prices
    @Test
    public void testMaxProfitAscending() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int actual = Main.maxProfit(prices);
        assertEquals(expected, actual);
    }

    // Test with an array of descending prices
    @Test
    public void testMaxProfitDescending() {
        int[] prices = {5, 4, 3, 2, 1};
        int expected = 0;
        int actual = Main.maxProfit(prices);
        assertEquals(expected, actual);
    }

    // Test with a mix of ascending and descending prices
    @Test
    public void testMaxProfitMixed() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = Main.maxProfit(prices);
        assertEquals(expected, actual);
    }

    // Test with an empty array
    @Test
    public void testMaxProfitEmptyArray() {
        int[] prices = {};
        int expected = 0;
        int actual = Main.maxProfit(prices);
        assertEquals(expected, actual);
    }

    // Test with an array of a single price
    @Test
    public void testMaxProfitSinglePrice() {
        int[] prices = {5};
        int expected = 0;
        int actual = Main.maxProfit(prices);
        assertEquals(expected, actual);
    }
}