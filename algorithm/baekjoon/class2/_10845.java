package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] queue = new int[N];
		int front = 0;
		int back = 0;
		
		while(N-- > 0) {
			String[] command = br.readLine().split(" ");
			
			switch(command[0]) {
			
			case "push":
				queue[back] = Integer.parseInt(command[1]);
				back++;
				break;
				
			case "pop":
				if(back != front) {
					sb.append(queue[front]).append("\n");
					front++;
				} else {
					sb.append(-1).append("\n");
				}
				break;
				
			case "size":
				sb.append(back - front).append("\n");
				break;
				
			case "empty":
				if(back == front) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
				
			case "front":
				if(front != back) {
					sb.append(queue[front]).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
				
			case "back":
				if(front != back) {
					sb.append(queue[back - 1]).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
				break;
			}
		}
		
		System.out.println(sb);

	}

}
