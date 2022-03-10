package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int size = 0;
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(size > input) {
				sb.append("NO");
				break;
			}else {
				if(size < input) {
					while(size < input) {
						size++;
						stack.push(size);
						sb.append("+").append("\n");
					}
				}
				
				if(size == input) {
					stack.pop();
					size--;
					sb.append("-").append("\n");
				}
			}
		}
		
		System.out.println(sb);

	}

}
