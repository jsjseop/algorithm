package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1003 {
	// 다이나믹 프로그래밍을 위한 배열
	public static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			Integer[] count = fibonacci(N);
			
			sb.append(count[0] + " " + count[1]).append("\n");
		}

		System.out.println(sb);
	}
	
	// 0과1을 호출하는 수를 리턴한다
	public static Integer[] fibonacci(int n) {
		
		if(n == 0) {
			dp[0][0] = 1;
			dp[0][1] = 0;
		} else if(n == 1) {
			dp[1][0] = 0;
			dp[1][1] = 1;
		}
		
		// dp에 값이 없을 경우 재귀
		if(dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
			dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
		
		return dp[n];
	}

}
