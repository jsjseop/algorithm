package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//sum만 double로 선언
		double sum = 0.0;
		int max = -1;
		
		//최대값과 합을 구함
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num > max) {
				max = num;
			}
			
			sum += num;
		}
		System.out.println((sum / max * 100) / n);
	}

}
