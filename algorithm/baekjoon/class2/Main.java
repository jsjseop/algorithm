package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			String[] arr = br.readLine().split(" ");
			int H = Integer.parseInt(arr[0]);
			int W = Integer.parseInt(arr[1]);
			int N = Integer.parseInt(arr[2]);
			
			int front = N % H;
			int back = N / H + 1;
			
			String result = "";
			
			if(back < 10) {
				result = front + "0" + back;
			} else {
				result = front +  "" + back;
			}
			
			if(N == H * W) {
				result = "" + H * W;
			}
			
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}

}
