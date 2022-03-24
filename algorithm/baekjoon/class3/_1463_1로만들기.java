package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1463_1로만들기 {

	static int count = 0;
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		dp = new int[N+1];
		dp[0] = dp[1] = 0;
		
		System.out.println(makeOne(N));
	}
	
	public static int makeOne(int x) {
		
		
		if(x == 1) {
			return count;
		}
		
		if(x % 3 == 0) {
			x = x / 3;
			count++;
			dp[x] = makeOne(x);
		} else if(x % 3 == 1) {
			x -= 1;
			count++;
			makeOne(x);
		} else if(x % 2 == 0) {
			x = x / 2;
			count++;
			makeOne(x);
		} else {
			x -= 1;
			count++;
			makeOne(x);
		}
	}

}
