package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 분해합
public class _2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int result = 0;
		
		for(int i=1; i<N; i++) {
			int sum = i;
			
			/*
			 * String num = Integer.toString(i); for(int j=0; j<num.length(); j++) { sum +=
			 * num.charAt(j) - '0'; }
			 */
			int num = i;
			while(num != 0) {
				sum += num%10;
				num /= 10;
			}
			
			if(sum == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);

	}

}
