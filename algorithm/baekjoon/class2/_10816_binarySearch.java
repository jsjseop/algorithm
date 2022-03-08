package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10816_binarySearch {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 이분 탐색을 하기 전에 정렬을 시켜준다.
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int key = Integer.parseInt(st.nextToken());
			// upperBound와 lowerBound의 차이가 해당 값의 개수
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(" ");
		}
		
		System.out.println(sb);
	}
	
	// 하한 : 키값 이상의 값이 처음 나오는 위치
	public static int lowerBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		// lo와 hi가 같아질때까지
		while(lo < hi) {
			// 중간인덱스를 구한다.
			int mid = (lo + hi) / 2;
			
			// 키값이 중간값보다 작거나 같을 경우 -> 왼쪽 탐색
			if(key <= arr[mid]) {
				hi = mid;
			// 키값이 중간값보다 클 경우 -> 오른쪽 탐색
			} else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
	
	// 상한 : 키값을 초과하는 값이 처음 나오는 위치
	public static int upperBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		// lo와 hi가 같아질때까지
		while(lo < hi) {
			// 중간인덱스를 구한다.
			int mid = (lo + hi) / 2;
			
			// 키값이 중간값보다 크거나 같을 경우 -> 오른쪽 탐색
			if(key >= arr[mid]) {
				lo = mid + 1;
			// 키값이 중간값보다 작을 경우 -> 왼쪽 탐색
			} else {
				hi = mid;
			}
		}
		// 키값이 배열의 마지막 원소랑 같을 때는 상한값이 +1 커져야 한다.
		if(arr[hi] == key) {
			hi++;
		}
		
		return hi;
	}

}
