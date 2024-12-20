import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int[] findMaxMin(int[] myList) {
        int min = myList[0];
        int max = myList[0];

        for (int i = 0; i < myList.length; i++) {
            min = Math.min(min, myList[i]);
            max = Math.max(max, myList[i]);
        }

        return new int[]{max, min};

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 6, 9};
        System.out.println(Arrays.toString(findMaxMin(arr)));

    }
}