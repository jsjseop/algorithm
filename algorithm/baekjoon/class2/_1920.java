package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 이분 탐색을 하기전에 정렬을 시켜준다.
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			sb.append(binarySearch(arr, Integer.parseInt(st.nextToken()))).append("\n");
		}
		
		System.out.println(sb);

	}
	
	public static int binarySearch(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		while(lo <= hi) {
			//중간 인덱스를 구한다.
			int mid = (lo + hi) / 2;
			
			// 키값이 중간값보다 작은 경우 -> 왼쪽 탐색
			if(key < arr[mid]) {
				hi = mid - 1;
			// 키값이 중간값보다 큰 경우 -> 오른쪽 탐색
			} else if(key > arr[mid]) {
				lo = mid + 1;
			// 키값과 중간값이 같은 경우(탐색 완료)
			} else {
				return 1;
			}
		}
		//키값이 배열에 없는 경우
		return 0;
	}

}
