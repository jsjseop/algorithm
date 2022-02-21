package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {
	//숫자의 개수
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] count_arr = new int[10];
		int result = 1;
		for(int i=0; i<3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		br.close();
		
		/*
		 * char[] arr = Integer.toString(result).toCharArray();
		 * 
		 * for(int i=0; i<arr.length; i++) {
		 * count_arr[Integer.parseInt(Character.toString(arr[i]))]++; }
		 */
		
		String str = Integer.toString(result);
		
		for(int i=0; i<str.length(); i++) {
			count_arr[str.charAt(i) - 48]++;
		}
		
		
		for(int i=0; i<10; i++) {
			sb.append(count_arr[i] + "\n");
		}
		System.out.println(sb);
		
	}

}
