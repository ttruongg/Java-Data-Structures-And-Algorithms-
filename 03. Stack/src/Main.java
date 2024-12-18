public class Main {
    public static void main(String[] args) {
        stack myStack = new stack(1);



        myStack.push(2);
        myStack.push(3);
        myStack.pop();

        myStack.getHeight();
        myStack.getTop();

        myStack.printStack();
    }
}