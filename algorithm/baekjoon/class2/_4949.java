package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 균형잡힌 세상
public class _4949 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		
		while(!(str = br.readLine()).equals(".")) {
			sb.append(check(str)).append("\n");
		}

		System.out.println(sb);
	}
	
	public static String check(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			// '('나 '['일 경우에는 stack에 push
			if(str.charAt(i) == '(') {
				stack.push('(');
			} else if(str.charAt(i) == '[') {
				stack.push('[');
			} 
			
			// 짝을 이루는 오른쪽 괄호가 오는 경우
			else if(str.charAt(i) == ')') {
				// stack이 비어있거나 짝을 이루지 않는 경우 종료
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if(str.charAt(i) == ']') {
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		
		// stack이 비어있으면 모든 괄호가 짝이 맞아서 pop이 되었다는 뜻
		if(stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}

}
