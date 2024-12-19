public class Main {

    public static String reverseString(String s) {
        Stack<Character> myString = new Stack<>();
        String result = "";
        for (char c : s.toCharArray()) {
            myString.push(c);
        }
        while (!myString.isEmpty()) {
            result = result + myString.pop();
        }
        return result;
    }



    public static void main(String[] args) {
        String s = "hello";

        System.out.println(reverseString(s));
    }
}