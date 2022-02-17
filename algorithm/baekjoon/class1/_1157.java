package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int[] arr = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			// 소문자인 경우
			// (97 <= s.charAt(i) && s.charAt(i) <= 122) 로도 작성 가능
			if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
			// 대문자인 경우
			} else {
				arr[s.charAt(i) - 65]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65); // 65를 더해서 대문자로 출력
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		sb.append(ch + "\n");
		System.out.print(ch);
	}
}
