public class Main {

    public static void sort(Stack<Integer> stack) {
        Stack<Integer> addtionalStack = new Stack<>();

        while (!stack.isEmpty()) {
            int tmp = stack.pop();

            while (!addtionalStack.isEmpty() && addtionalStack.peek() > tmp) {
                stack.push(addtionalStack.pop());
            }

            addtionalStack.push(tmp);
        }

        while (!addtionalStack.isEmpty()) {
            stack.push(addtionalStack.pop());
        }

    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sort(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
    }
}