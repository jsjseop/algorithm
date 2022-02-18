package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double[] arr = new double[n];
		
		//double 배열에 모든 값을 저장
		for(int i=0; i<n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		//Arrays의 sort()를 사용하여 오름차순으로 정렬, 마지막값이 최대값
		Arrays.sort(arr);
		double sum = 0.0;

		for(int i=0; i<n; i++) {
			sum += (arr[i] / arr[n-1] * 100);
		}
		System.out.println(sum / n);
	}

}
