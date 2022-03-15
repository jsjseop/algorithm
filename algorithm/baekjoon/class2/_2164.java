package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2164 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0; i<N; i++) {
			q.add(i+1);
		}
		
		while(q.size() > 1) {
			if(q.size() == 2) {
				q.poll();
				break;
			}
			q.poll();
			q.add(q.poll());
		}
		
		System.out.print(q.peek());
	}

}
