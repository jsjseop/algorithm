package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2562 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int max = -1;
		int count = 0;
		int max_count = 0;
		
		for(int i=0; i<9; i++) {
			int num = Integer.parseInt(br.readLine());
			count++;
			if(num > max) {
				max = num;
				max_count = count;
			}
		}
		br.close();
		
		sb.append(max + "\n" + max_count);
		System.out.println(sb);
	}
}
