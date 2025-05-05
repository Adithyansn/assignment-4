import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    // a. Push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    // b. Pop an element from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            System.out.println("Popped: " + popped);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // c. Check if the stack is empty
    public void isEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();

        s.isEmpty();            // Check if stack is empty
        s.pushElement(10);      // Push element
        s.pushElement(20);
        s.popElement();         // Pop element
        s.isEmpty();            // Check again
    }
}
