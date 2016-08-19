package ssa;
import java.util.Stack;

public class RPNCalculator {

    public static void main(String[] args) {

	RPNCalculator rpn = new RPNCalculator();
	rpn.eval();
    }

    //  Method to evaluate the operation 
    public void eval()

    {
	String expressionToBeEvalauted = ("4 5 * 1 ^");
	System.out.println("Calculating " + expressionToBeEvalauted);
	 Calc(expressionToBeEvalauted);

    }
    
 

    public void Calc(String expr) {

	Stack<Integer> stack = new Stack<Integer>();

	System.out.println("Input\tOperation\tStack after");

	for (String num : expr.split("\\s")) {
	    System.out.print(num + "\t");
	    Integer number = null;

	    try {
		number = Integer.parseInt(num);
	    }

	    catch (NumberFormatException e) {

	    }

	    if (number != null) {
		System.out.print("Push\t\t");
		stack.push(Integer.parseInt(num + ""));
	    }

	    else if (num.equals("-")) {
		System.out.print("Operate\t\t");
		int secondNum = stack.pop();
		int firstNum = stack.pop();
		stack.push(firstNum - secondNum);
	    }

	    else if (num.equals("+")) {
		System.out.print("Operate\t\t");
		int secondNum = stack.pop();
		int firstNum = stack.pop();
		stack.push(firstNum + secondNum);
	    }

	    else if (num.equals("^")) {
		System.out.print("Operate\t\t");
		int secondNum = stack.pop();
		int firstNum = stack.pop();
		stack.push((int) Math.pow(firstNum, secondNum));
		
	    } else if (num.equals("*")) {
		System.out.print("Operate\t\t");
		int secondNum = stack.pop();
		int firstNum = stack.pop();
		stack.push(firstNum * secondNum);
	    }

	    else if (num.equals("/")) {
		System.out.print("Operate\t\t");
		int secondNum = stack.pop();
		int firstNum = stack.pop();
		stack.push(firstNum / secondNum);
	    }

	    else {

		System.out.println("Err");
		return;
	    }
	    System.out.println(stack);
	}
	System.out.println("");
	System.out.println("Answer: " + stack.pop());
    }

}
