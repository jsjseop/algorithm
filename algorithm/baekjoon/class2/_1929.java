package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1929 {

	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] mn = br.readLine().split(" ");
		int M = Integer.parseInt(mn[0]);
		int N = Integer.parseInt(mn[1]);
		StringBuilder sb = new StringBuilder();
		
		findPrime(N);
		
		for(int i=M; i<=N; i++) {
			// false이면 소수이므로 출력
			if(!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);

	}
	
	// 소수가 아니면 true, 소수이면 false를 저장한다.
	public static void findPrime(int num) {
		// num까지의 boolean 배열을 생성
		prime = new boolean[num + 1];
		
		// 0과1은 소수가 아니므로 true
		prime[0] = prime[1] = true;
		
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			//이미 체크된 수는 건너뜀
			if(prime[i] == true) {
				continue;
			}
			
			// i의 배수들을 모두 true로 저장
			for(int j=i*i; j<prime.length; j=j+i) {
				prime[j] = true;
			}
		}
	}

}
