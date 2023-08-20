package neetcode.stack;
import java.util.Stack;
public class ReversePolishNotation {
	//tokens = ["2","1","+","3","*"]
	//output = ((2 + 1) * 3) = 9
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> inputStack = new Stack<>();
		inputStack.add('2');
		inputStack.add('1');
		inputStack.add('+');
		inputStack.add('3');
		inputStack.add('*');
	}

}
