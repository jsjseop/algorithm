package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 스택 구현
public class _10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] stack = new int[N];
		int size = 0;
		
		while(N-- > 0) {
			String[] command = br.readLine().split(" ");
			
			if(command[0].equals("push")) {
				stack[size] = Integer.parseInt(command[1]);
				size++;
			} else if(command[0].equals("pop")) {
				if(size != 0) {
					sb.append(stack[size - 1]).append("\n");
					size--;
				} else {
					sb.append(-1).append("\n");
				}
			} else if(command[0].equals("size")) {
				sb.append(size).append("\n");
			} else if(command[0].equals("empty")) {
				if(size != 0) {
					sb.append(0).append("\n");
				} else {
					sb.append(1).append("\n");
				}
			} else if(command[0].equals("top")) {
				if(size != 0) {
					sb.append(stack[size - 1]).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			}
		}
		
		System.out.println(sb);

	}

}
