package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 벌집
public class _2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int start = 1;
		int count = 0;
		
		while(true) {
			start += count*6;
			if(start >= N) {
				break;
			}
			count++;
		}
		
		System.out.println(count+1);
	}

}
