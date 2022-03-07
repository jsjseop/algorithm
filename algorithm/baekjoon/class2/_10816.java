package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10816 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			int key = Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
			/*
			 * getOrDefault(key, defaultValue)
			 * map에 저장된 key값에 대한 value를 반환한다.
			 * 저장된 값이 없을 경우 defaultValue를 반환한다.
			 */		
			}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(key, 0)).append(" ");
		}
		
		System.out.println(sb);
	}

}
