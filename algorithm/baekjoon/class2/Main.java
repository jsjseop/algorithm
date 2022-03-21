package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i + 1;
		}
		
		StringBuilder sb = new StringBuilder("<");
		
		int index = -1;
		
		while(N > 0) {
			index = (index + K) % 7;
			if(N != 1) {
				sb.append(arr[index]).append(", ");
			} else {
				sb.append(arr[index]).append(">");
			}
			N--;
		}

		System.out.println(sb);
		
	}

}
