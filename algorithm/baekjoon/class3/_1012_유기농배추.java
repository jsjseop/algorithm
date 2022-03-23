package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012_유기농배추 {

	static int[][] arr;
	static boolean[][] visited;
	static int count;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			// 상하좌우 한칸씩 범위를 크게 만들었다.
			arr = new int[N+2][M+2];
			visited = new boolean[N+2][M+2];
			count = 0;
			
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x+1][y+1] = 1;
			}
			
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<M+1; j++) {
					if(arr[i][j] == 1 && visited[i][j] == false) {
						count++;
						dfs(i, j);
					}
				}
			}
			
			sb.append(count).append("\n");
			
		}
		
		System.out.println(sb);

	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		if(arr[x][y+1] == 1 && visited[x][y+1] == false) {
			dfs(x, y+1);
		}
		if(arr[x+1][y] == 1 && visited[x+1][y] == false) {
			dfs(x+1, y);
		}
		if(arr[x][y-1] == 1 && visited[x][y-1] == false) {
			dfs(x, y-1);
		}
		if(arr[x-1][y] == 1 && visited[x-1][y] == false) {
			dfs(x-1, y);
		}
	}

}
