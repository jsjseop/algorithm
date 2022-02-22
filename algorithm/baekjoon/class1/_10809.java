package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i) - 'a'] == -1) {
				arr[str.charAt(i) - 97] = i;
			}
		}
		
		for(int val : arr) {
			sb.append(val + " ");
		}
		System.out.println(sb);
		
	}

}
