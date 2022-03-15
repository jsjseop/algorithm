package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수(유클리드 호제법), 최소공배수
public class _2609 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int GCD = gcd(A, B); // 최대공약수
		// A = a*d, B = b*d, AB = abd*d
		// 최소공배수 = AB / d = abd
		int LCM = A * B / GCD; 
		
		System.out.println(GCD);
		System.out.println(LCM);

	}
	
	// 최대공약수 : r = a mod b 일 때, GCD(a, b) = GCD(b, r) 이다.
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}
