
public class StackExample {
    int stack[] = new int[5];
    int top = -1;

    void push(int value) {
        if (top == 4) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    void display() {
        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackExample s = new StackExample();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.pop();
        s.display();
    }
}
