package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1181 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		// 정렬을 위한 Comparator 생성
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {

				// 길이가 같을 경우 사전 순으로
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					// 길이가 짧은 순으로 정렬되게 한다
					return s1.length() - s2.length();
				}
			}
		});
		
		/*
		 * Arrays.sort(arr, (s1, s2) -> { // 길이가 같을 경우 사전 순으로 if(s1.length() ==
		 * s2.length()) { return s1.compareTo(s2); } else { // 길이가 짧은 순으로 정렬되게 한다 return
		 * s1.length() - s2.length(); } });
		 */
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0]).append("\n");
		
		// 같은 단어는 출력되지 않게 한다
		for(int i=0; i<N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb);
		
	}

}