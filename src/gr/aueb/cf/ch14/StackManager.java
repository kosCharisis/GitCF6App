package gr.aueb.cf.ch14;

public class StackManager {
    private static final StackManager INSTANCE = new StackManager();

    private StackManager() {}

    public static StackManager getInstance() {
        return INSTANCE;
    }

    static int[] stack = new int[100];
    static int top = -1;
    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = num;
    }
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public static boolean isFull() {
        return top == stack.length -1;
    }

    public static boolean isEmpty() {
        return top == -1;
    }
}
