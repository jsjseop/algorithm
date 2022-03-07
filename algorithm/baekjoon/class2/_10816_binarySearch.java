package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		

	}
	
	public static int lowerBound(int[] arr, int key) {
		
		int lo = 0;
		int hi = arr.length - 1;
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				
			}
		}
	}

}
