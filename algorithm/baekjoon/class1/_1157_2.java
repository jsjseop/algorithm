package class1;

import java.io.IOException;

public class _1157_2 {

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[26];
		int c = System.in.read();
		
		while(c > 64) {  // 공백 입력할 경우 종료
			if(c > 96) {  // 소문자인 경우
				arr[c - 97]++;
			} else {  // 대문자인 경우
				arr[c - 65]++;
			}
			c = System.in.read();  // 한 byte씩 읽는다
		}
		
		int max = -1;
		int ch = -2;  // ?는 63이다 (-2 + 65 = 63)
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if(arr[i] == max) {
				ch = -2;
			}
		}
		//마지막에 char로 캐스팅 후 출력
		sb.append((char)(ch + 65));
		System.out.print(sb);
	}
}
