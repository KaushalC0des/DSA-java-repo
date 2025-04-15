import java.util.Stack;
public class reverseStack {
    // reverse stack using recursion
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,top);
    }
    public static void insertAtBottom(Stack<Integer> stack, int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top); // after pushing this will push all poped values again in stack
    }
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("orignal stack is " + stack);

        reverseStack(stack);
        System.out.println("Reversed stack is " + stack);

        
    }
    
}
