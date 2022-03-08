package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1654 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[K];
		for(int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		// 자연수이므로 최솟값은 1부터 시작한다.
		long min = 1;
		long max = arr[arr.length - 1];
		long mid = 0;
		
		while(min <= max) {
			int count = 0;
			// 랜선을 반으로 나눈 크기
			mid = (min + max) / 2;
			
			for(int i=0; i<K; i++) {
				count += arr[i] / mid;
			}
			
			// 랜선의 길이가 길기 때문에 max를 줄인다.
			if(count < N) {
				max = mid - 1;
			// 랜선의 길이가 짧으므로 min을 늘린다.
			} else {
				min = mid + 1;
			}
		}
		
		System.out.print(max);

	}

}
