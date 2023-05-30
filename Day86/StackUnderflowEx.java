import java.util.Stack;
public class StackUnderflowEx {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10); // inserting the elements into the stack

        stack.push(20);

        stack.push(30);

        stack.push(40);

        System.out.println(stack);

        stack.pop(); // deleting the elements from the stack

        stack.pop();

        stack.pop();

        stack.pop();

        System.out.println(stack); // empty stack will be returned

    }
}
