
import java.util.Stack;
public class palindromeCheck{
    public static boolean isPalindrome(int[] arr){
        Stack<Integer> stack = new Stack<>();
        // push all the elements in stack
        for(int num : arr){
            stack.push(num);
        }
        // compare each element with top of the stack
        for(int num : arr){
            if(num != stack.pop()){
                return false; // mismatch found
            } 
        }
        return true; // All elements matched
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        if(isPalindrome(arr)){
            System.out.println("The array is palindrome");
        } else {
            System.out.println("array is not palindrome");
        }
    }
}