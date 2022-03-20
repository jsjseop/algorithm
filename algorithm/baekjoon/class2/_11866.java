package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _11866 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		StringBuilder sb = new StringBuilder("<");
		
		int index = 0;
		
		while(N > 1) {
			index += (index + (K - 1)) % list.size();
			sb.append(list.remove(index)).append(", ");
		}
		sb.append(list.remove()).append(">");

		System.out.println(sb);
		
	}

}
