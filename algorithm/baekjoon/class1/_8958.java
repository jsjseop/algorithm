package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<testCase; i++) {
			String str = br.readLine();
			int sum = 0;
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {
					count++;
					sum += count;
				} else {
					count = 0;
				}
			}
			sb.append(sum).append("\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}
