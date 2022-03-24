package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1389_케빈베이컨의6단계법칙 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int INF = 10000000;
		int[][] arr = new int[N+1][N+1];
		
		// 자신에서 자신으로 가는 경로는 0으로
		// 나머지는 모두 INF로 초기화한다
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				arr[i][j] = INF;
				if(i == j) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// 양방향 연결
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		// 플로이드 와샬을 이용해 최단거리를 구한다
		for(int k=1; k<=N; k++) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					if(arr[i][k] + arr[k][j] < arr[i][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		int num = 0;
		
		// 케빈 베이컨의 최솟값을 찾는다
		for(int i=1; i<=N; i++) {
			int sum = 0;
			for(int j=1; j<=N; j++) {
				sum += arr[i][j];
			}

			if(sum < min) {
				min = sum;
				num = i;
			}
		}
		
		System.out.println(num);

	}

}
