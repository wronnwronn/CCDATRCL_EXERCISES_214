// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Short_stack = new Stack(5);
  
      // Insert new elements into the stack
      Short_stack.push("Blue Short");
      Short_stack.push("Black Short");
      Short_stack.push("Maroon Short");
      Short_stack.push("Green Short");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Short_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Short_stack.peek());
  
      // Remove top element in the stack
      Short_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Short_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Short_stack.peek());
    }
  }
