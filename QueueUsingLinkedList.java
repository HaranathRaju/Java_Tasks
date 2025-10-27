class NodeQ {
    int data;
    NodeQ next;

    NodeQ(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    private NodeQ front, rear;


    public void enqueue(int data) {
        NodeQ newNode = new NodeQ(data);
        if (rear == null) { 
            front = rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) rear = null; 
        return removed;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }


    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        NodeQ temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        queue.display();
    }
}
