package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int five = 0;
		int three = 0;
		
		if(N % 5 == 0) {
			five = N / 5;
			System.out.println(five);
		} else {
			int r = N % 5;
			if(r % 3 == 0) {
				three = r / 3;
				System.out.println(five + three);
			} else {
				for(int i=0; i<five; i++) {
					five -= 1;
					r += 5;
					if(r % 3)
				}
			}
		}

	}

}
