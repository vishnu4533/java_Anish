// public int peek() {
//     if (nItems == 0) {
//         System.out.println("Queue is empty. Cannot peek.");
//         return -1;
//     } else {
//         return queueArray[front];
//     }
// }

// public boolean isEmpty() {
//     return nItems == 0;
// }

// public boolean isFull() {
//     return nItems == maxSize;
// }
public class Queueds {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queueds(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int value) {
        if (nItems == maxSize) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            nItems++;
            System.out.println("Enqueued " + value + " into the queue.");
        }
    }

    public int dequeue() {
        if (nItems == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize; 
            nItems--;
            return value;
        }
    }
    public static void main(String[] args) {
        Queueds queue = new Queueds(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        
        queue.enqueue(40);
        queue.enqueue(50);
        
        
        queue.enqueue(60);
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
    }

}
