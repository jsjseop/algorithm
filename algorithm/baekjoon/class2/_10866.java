package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class _10866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		
		while(N-- > 0) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
			
			case "push_front":
				dq.addFirst(Integer.parseInt(str[1]));
				break;
			case "push_back":
				dq.addLast(Integer.parseInt(str[1]));
				break;
			case "pop_front":
				if(dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(dq.pollFirst()).append("\n");
				}
				break;
			case "pop_back":
				if(dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(dq.pollLast()).append("\n");
				}
				break;
			case "size":
				sb.append(dq.size()).append("\n");
				break;
			case "empty":
				if(dq.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "front":
				if(dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(dq.peekFirst()).append("\n");
				}
				break;
			case "back":
				if(dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(dq.peekLast()).append("\n");
				}
				break;
			}
		}
		
		System.out.println(sb);

	}

}
