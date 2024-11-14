
import java.util.*;

public class Stack_reverse {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);  
        s.push(3);
        s.push(4);
        s.push(5);
        
        System.out.println("Original Stack: " + s);
        
        reverseStack(s);
        
        System.out.println("Reversed Stack: " + s);
    }

   
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseStack(stack);

        insertAtLast(stack, top);
    }

    public static void insertAtLast(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int top = stack.pop();
            insertAtLast(stack, item);
            stack.push(top);
        }
    }
}