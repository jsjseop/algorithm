package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 설탕배달
public class _2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int five = 0;
		int three = 0;
		
		if(N == 4 || N == 7) {
			System.out.println("-1");
			return;
		}
		
		if(N % 5 == 0) {
			five = N / 5;
			System.out.println(five);
		} else {
			five = N / 5;
			int r = N % 5;
			if(r % 3 == 0) {
				three = r / 3;
				System.out.println(five + three);
			} else if(r == 2) {
				five -= 2;
				three = (r + 10) / 3;
				System.out.println(five + three);
			} else {
				five -= 1;
				three = (r + 5) / 3;
				System.out.println(five + three);
			}
		}

	}

}
