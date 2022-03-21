package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Hashing
public class _15829 {

	static final int M = 1234567891;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long hash = 0;
		long pow = 1;
		
		// 모듈러 연산 분배법칙을 적용하여 계산
		for(int i=0; i<L; i++) {
			hash += (str.charAt(i) - 'a' + 1)%M * pow;
			pow = pow * 31 % M;
		}
		
		System.out.println(hash % M);

	}

}
