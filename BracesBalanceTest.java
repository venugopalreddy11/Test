package com.concepts.core.java.test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Parser {

	public boolean isBalanced(String expression) {

		Stack<Character> openBrackets = new Stack<Character>();
		
		char[] chrArr = new char[0];
		if(expression != null && expression.length() > 0) {
			chrArr = expression.toCharArray();			
		}

		for (Character ch : chrArr) {
			if (isOpen(ch)) {
				openBrackets.push(ch);
			} else if (openBrackets.isEmpty()) {
				return false;
			} else {
				Character open = openBrackets.pop();
				if (!isPair(open, ch)) {
					return false;
				}
			}
		}

		// If we have more open brackets than closed brackets
		if (openBrackets.size() > 0) {
			return false;
		}
		return true;
	}

	private static boolean isOpen(Character c) {
		return c != null && (c.equals('(') || c.equals('[') || c.equals('{'));
	}

	private static boolean isPair(Character open, Character close) {
		if (open == null || close == null) {
			return false;
		} else if (open.equals('(') && close.equals(')')) {
			return true;
		} else if (open.equals('[') && close.equals(']')) {
			return true;
		} else if (open.equals('{') && close.equals('}')) {
			return true;
		} else {
			return false;
		}
	}

}

public class BracesBalanceTest {
	public static void main(String[] args) {
		
		String[] expArr = { "{}()", "{()}", "({()})" };
		String[] expArr1 = { "{}(", "({)}", "((", "}{", "({})" };
		String[] expArr2 = { "({()})", "({)}" };
		String[] expArr3 = { "{}(]" };
		String[] expArr4 = { "[{}]", "[{]}" };

		Parser sol = new Parser();

		List<String> resList = new ArrayList<>();
		for (int i = 0; i < expArr4.length; i++) {
			boolean answer = sol.isBalanced(expArr4[i]);
			if (answer) {
				//System.out.println("YES");
				resList.add("YES");
			} else {
				//System.out.println("NO");
				resList.add("NO");
			}
		}		
		System.out.println(resList);
	}
}