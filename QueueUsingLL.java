// package Queue;

public class QueueLL {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static Node head;
    public static Node front;
    public static Node rear;
    public static int size;

    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (isEmpty()) {
            rear = front = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("queue Empty");
            return -1;
        }
        return front.data;
    }

    public int delete() {
        if(isEmpty()) {
            System.out.println("empty Queue");
            return -1;
        }
        int val = front.data;
        size--;
        if(front == rear) {
            front = rear = null;
            return val;
        }
        front = front.next;
        return val;
    }

    public void print() {
        Node curr = front;
        if (curr == null) {
            System.out.println("empty Queue");
            return;
        }
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(size);

        q.delete();
        q.delete();
        // System.out.println(q.delete());
        // q.delete();
        // System.out.println(size);
        q.print();
    }
}
