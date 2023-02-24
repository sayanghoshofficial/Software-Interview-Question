import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int poppedElement = stack.pop();
        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(3);
        stack.push(5);
        System.out.println(stack.getMin()); // Output: 3

        stack.push(2);
        stack.push(4);
        System.out.println(stack.getMin()); // Output: 2

        stack.pop();
        System.out.println(stack.getMin()); // Output: 2

        stack.pop();
        System.out.println(stack.getMin()); // Output: 3
    }
}
