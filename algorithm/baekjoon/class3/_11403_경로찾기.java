package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11403_경로찾기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][N];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				 arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// k를 거쳐서 i->j로 갈 수 있는 경우 1로 저장
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(arr[i][k] + arr[k][j] == 2) {
						arr[i][j] = 1;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);

	}

}
