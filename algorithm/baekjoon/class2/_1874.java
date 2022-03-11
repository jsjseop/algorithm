package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int top = 0;
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			int input = Integer.parseInt(br.readLine());
			
			//입력값이 스택의 top값보다 클 경우 -> input값까지 push
			if(input > top) {
				for(int j=top; j<input; j++) {
					stack.push(j+1);
					sb.append("+").append("\n");
				}
				//top값을 변경
				top = input;
			}
			
			//스택의 top값과 입력값이 같을 경우 -> pop
			if(stack.peek() == input) {
				stack.pop();
				sb.append("-").append("\n");
			// 스택의 top값과 입력값이 다를 경우 -> 종료
			} else {
				//sb 초기화
				sb.setLength(0);
				sb.append("NO");
				break;
			}
		}
		
		System.out.println(sb);

	}

}
