package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			Queue<int[]> queue = new LinkedList<>();
			
			for(int j=0; j<N; j++) {
				queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			
			int count = 0;
			
			while(!queue.isEmpty()) {
				int[] first = queue.remove();
				boolean isMax = true;
				
				Iterator<int[]> it = queue.iterator();
				while(it.hasNext()){
					if(first[1] < it.next()[1]) {
						isMax = false;
						queue.add(first);
						break;
					}
				}
				
				if(isMax == false) {
					continue;
				} else {
					count++;
					if(first[0] == M) {
						sb.append(count).append("\n");
						break;
					}
				}
			}
		}

		System.out.println(sb);
	}

}
