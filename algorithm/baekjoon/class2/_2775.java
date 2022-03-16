package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부녀회장의 될거야
public class _2775 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int[][] arr = new int[15][15];
		
		for(int i=1; i<15; i++) {
			arr[0][i] = i; // 0층의 i호는 모두 i로 초기화
			arr[i][1] = 1; // i층의 1호는 모두 1로 초기화
		}
		
		// 모든 호의 값 저장
		for(int i=1; i<15; i++) {
			for(int j=1; j<15; j++) {
				arr[i][j] = arr[i][j-1] + arr[i-1][j]; 
			}
		}
		
		while(T-- > 0) {
			sb.append(arr[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())]).append("\n");
		}
		
		System.out.println(sb);

	}

}
