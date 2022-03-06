package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 665;
		int count = 0;
		
		while(true) {
			num++;
			if(Integer.toString(num).contains("666")) {
				count++;
				if(N == count) {
					break;
				}
			}
		}
		System.out.println(num);

	}

}
