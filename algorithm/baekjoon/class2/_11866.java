package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 요세푸스 문제 0
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
		
		while(list.size() > 1) {
			// K-1번째 원소를 제거하는데 list크기를 넘어가는 경우가 있으므로
			// list.size로 나눈 나머지 값을 index로 한다
			index = (index + (K - 1)) % list.size();
			sb.append(list.remove(index)).append(", ");
		}
		sb.append(list.remove()).append(">");

		System.out.println(sb);
		
	}

}
