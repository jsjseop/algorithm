package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1389_케빈베이컨의6단계법칙 {

	static int N;
	static List<Integer>[] list;
	static boolean[][] check;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		list = new List[N+1];
		check = new boolean[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		int[] arr = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = bfs(i);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);

	}
	
	public static int bfs(int num) {
		
		Queue<Integer> q = new LinkedList<>();
		int sum = 0;
		
		for(int i=1; i<=N; i++) {
			if(num == i) continue;
			check[num][num] = true;
			q.add(num);
			boolean isEnd = false;
			
			while(true) {
				int temp = q.poll();
				sum++;
				
				for(int val : list[temp]) {
					if(check[num][val] == false) {
						if(val == i) {
							isEnd = true;
							break;
						}
						q.add(val);
						check[num][val] = true;
					}
				}
				if(isEnd) break;
				sum--;
			}
		}
		
		return sum;
		
	}

}
