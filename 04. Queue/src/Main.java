public class Main {
    public static void main(String[] args) {
        queue myQueue = new queue(1);

        myQueue.enqueue(2);
        myQueue.enqueue(3);

        myQueue.dequeue();
        myQueue.printQueue();
    }
}