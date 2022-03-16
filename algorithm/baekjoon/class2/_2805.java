package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나무 자르기
public class _2805 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int min = 0;
		int max = 0;
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		br.close();
		
		// min 과 max가 같아지면 종료
		while(min < max) {
			int mid = (min + max) / 2;
			long len = 0;
			
			for(int i=0; i<N; i++) {
				// arr[i] - mid 값이 0보다 클 경우만 더한다
				if(arr[i] > mid) {
					len += (arr[i] - mid); // 가져갈 나무의 길이의 합
				}	
			}
			
			// 가져갈 나무의 길이가 M보다 작거나 같은 경우 -> min을 1증가하여 우측 탐색
			if(len >= M) {
				min = mid + 1;
			// 가져갈 나무의 길이가 M보다 큰 경우 -> 좌측 탐색
			} else {
				max = mid;
			}
		}
		// max값이 상한값이므로 -1을 해준다
		System.out.println(max - 1);

	}

}
