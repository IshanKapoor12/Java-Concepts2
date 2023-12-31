// Add -> At the tail
// Remove -> At the head (FIFO)
// Peek -> Data at head

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return (head == null && tail == null);
        }

        // Enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if(tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Dequeue
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            // single element condition
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // Peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println(("Empty Queue"));
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Main.Queue q = new Main.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Item removed: " + q.remove());
        q.add(6);
        System.out.println("Item removed: " + q.remove());
        q.add(7);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
