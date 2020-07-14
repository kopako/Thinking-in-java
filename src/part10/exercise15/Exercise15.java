package part10.exercise15;

import java.util.Arrays;

import net.mindview.util.Stack;
/**
 * Exercise 15:   (4) Stacks are often used to evaluate expressions in 
 * programming languages. Using net.mindview.util.Stack, evaluate the 
 * following expression, where’+’ means "push the following letter onto 
 * the stack," and’-’ means "pop the top of the stack and print it": 
 * "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—"
 * 
 * @author kopan.dmytro
 *
 */
class Exercise15 {
	public static void main(String[] args) {
		char[] asItIs = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".toCharArray();
		char[] formatted = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+ -+r+u-+l+e+s-".toCharArray();
		
			System.out.println(process(asItIs));
			System.out.println(process(formatted));
			
	
	}
	
	static Stack<Character> process(char[] arr) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '+') {
				i+=1;
				stack.push(arr[i]);
			}
			if (arr[i] == '-') {
				System.out.println(stack.pop());
			}
		}
		return stack;
	}
}