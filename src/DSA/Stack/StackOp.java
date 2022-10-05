package DSA.Stack;

public class StackOp {
    private int arr[];
    private int top;
    private int capacity;

    StackOp(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    public void printstack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackOp s = new StackOp(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.printstack();
    }
}
