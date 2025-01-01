import java.util.Stack;

public class StackC {

    private Stack<Integer> stack;

    public StackC() {
        stack = new Stack<>();
    }

    public void push(int data) {
        stack.push(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Or throw an exception
        }
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackC stackExample = new StackC();

        stackExample.push(10);
        stackExample.push(20);
        stackExample.push(30);

        System.out.println("Popped element: " + stackExample.pop());
        System.out.println("Popped element: " + stackExample.pop());

        stackExample.push(40);

        while (!stackExample.isEmpty()) {
            System.out.println("Popped element: " + stackExample.pop());
        }
    }
}