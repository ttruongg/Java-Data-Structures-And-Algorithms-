import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static String findLongestString(String[] stringList) {
        String longestString = "";
        for (String str : stringList) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;

    }

    public static void main(String[] args) {
        String[] strings = {};
        System.out.println(findLongestString(strings));

    }
}