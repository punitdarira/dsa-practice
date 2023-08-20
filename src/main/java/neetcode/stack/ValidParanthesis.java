package neetcode.stack;

import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

public class ValidParanthesis {

	public static void main(String[] args) {
		System.out.println(isValidParanthases("{()}"));

	}

	private static boolean isValidParanthases(String inputString) {
		Map<Character, Character> pairs = new HashMap<>();
		pairs.put('}', '{');
		pairs.put(']', '[');
		pairs.put(')', '(');

		Stack<Character> inputStack = new Stack<>();
		for (int i = 0; i < inputString.length(); i++) {
			if (pairs.containsValue(inputString.charAt(i))) {
				inputStack.add(inputString.charAt(i));
			} else {
				if (!inputStack.pop().equals(pairs.get(inputString.charAt(i)))) {
					return false;
				}
			}
		}
		return true;
	}

}
