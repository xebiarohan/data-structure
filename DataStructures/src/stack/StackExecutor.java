package stack;

public class StackExecutor {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(10);

        stack.printStack();
        stack.getTop();
        stack.getHeight();
    }
}
