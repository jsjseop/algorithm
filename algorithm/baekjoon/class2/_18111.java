package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _18111 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] land = new int[N][M];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				land[i][j] = Integer.parseInt(st.nextToken());
				
				// 만들어질 수 있는 땅의 최댓값, 최솟값을 구한다
				max = Math.max(max, land[i][j]);
				min = Math.min(min, land[i][j]);
			}
		}
		
		int minTime = Integer.MAX_VALUE;
		int height = 0;
		
		for(int i=min; i<=max; i++) {
			int time = 0;
			int inventory = B;
			
			// 모든 높이를 i로 만드는데 걸리는 시간과 남은 블록 수를 구한다.
			for(int j=0; j<land.length; j++) {
				for(int k=0; k<land[j].length; k++) {
					int gap = land[j][k] - i;
					if(gap > 0) {
						time += gap * 2;
						inventory += gap;
					} else {
						time += Math.abs(gap);
						inventory -= Math.abs(gap);
					}
				}
			}
			
			// 블록수가 음수이면 실패
			if(inventory >= 0) {
				if(time <= minTime) {
					minTime = time;
					height = i;
				}
			}
		}
		
		System.out.println(minTime + " " + height);

	}

}
