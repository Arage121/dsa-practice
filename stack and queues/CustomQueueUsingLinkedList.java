public class CustomQueueUsingLinkedList {
    private Node front; // for removing from start
    private Node rear; // for inserting from end as it is a line(queue)

    private class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Enqueue operation: Add an item to the rear of the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue operation: Remove and return the item from the front of the queue
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return removed;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println();
    }
}
