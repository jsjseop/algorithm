package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {

	public static Integer reverse(char[] arr) {
		
		char temp = 0;
		
		temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		
		return Integer.parseInt(new String(arr));
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		char[] arrA = st.nextToken().toCharArray();
		char[] arrB = st.nextToken().toCharArray();
		
		int A = reverse(arrA);
		int B = reverse(arrB);
		
		if(A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}

	}

}
