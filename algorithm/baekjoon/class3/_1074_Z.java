package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1074_Z {

	static int r;
	static int c;
	static int number = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		int size = (int)Math.pow(2, N);
		
		findNumber(0, 0, size);

	}
	
	public static void findNumber(int x, int y, int size) {
		
		int half = size / 2;
		
		// size가 1이 되면 재귀를 멈추고 값을 출력
		if(size == 1) {
			System.out.println(number);
			return;
		}
		
		// 총 배열을 size/2의 크기로 4등분해서 재귀하며 값을 찾는다.
		if(r < x + half && c < y + half) {
			findNumber(x, y, half);
		} else if(r < x + half && c < y + size) {
			number += half * half;
			findNumber(x, y + half, half);
		} else if(r < x + size && c < y + half) {
			number += 2 * half * half;
			findNumber(x + half, y, half);
		} else {
			number += 3 * half * half;
			findNumber(x + half, y + half, half);
		}
		
	}

}
