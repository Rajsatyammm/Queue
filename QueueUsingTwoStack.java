import java.util.Stack;

// package Queue;

public class QueueusingtwoStack {

    public static Stack<Integer> s1 = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();

    public static void push(int data) {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }

    public static int pop() {
        return s1.pop();
    }

    public static int peek() {
        return s1.peek();
    }

    public static void main(String[] args) {

        QueueusingtwoStack q = new QueueusingtwoStack();
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);

        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }

    }
}
