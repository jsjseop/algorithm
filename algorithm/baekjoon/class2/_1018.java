package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {

	public static boolean[][] arr;
	public static int min_count = 64;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 입력받은 NxM 크기의 배열을 생성한다.
		arr = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			// W이면 true, B이면 false를 저장한다.
			for(int j=0; j<M; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		br.close();
		
		//8x8 크기가 만들어지는 경우의 수 만큼 testDraw() 실행
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				testDraw(i, j);
			}
		}
		System.out.println(min_count);

	}
	
	public static void testDraw(int N, int M) {
		
		int count = 0;
		// 첫번째 칸의 색
		boolean BW = arr[N][M];
		
		for(int i=N; i<N+8; i++) {
			for(int j=M; j<M+8; j++) {
				// 해당 칸의 색이 틀릴 경우
				if(arr[i][j] != BW) {
					//색을 칠해야 되는 개수 증가
					count++;
				}
				// 다음 칸의 색은 반대 색으로 변경
				BW = !BW;
			}
			//다음 줄의 첫 번째 색은 한번 더 반대로 변경
			BW = !BW;
		}
		
		/* 
		 * 첫 번째 칸이 W일 때와
		 * 반대로 B일 때의 개수 중 작은 값 선택 
		 */
		count = Math.min(count, (64 - count));
		/* 
		 * 이전 까지의 경우의 수의 개수와
		 *  현재 경우의 개수 중 작은 값으로 최솟값 변경
		 */
		min_count = Math.min(min_count, count);
	}

}
