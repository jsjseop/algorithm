package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int num = Integer.parseInt(st.nextToken());
		String result = "";
		
		if(num == 1) {
			for(int i=0; i<7; i++) {
				if(Integer.parseInt(st.nextToken()) == num + 1) {
					num++;
					if(num == 8) {
						result = "ascending";
					}
				} else {
					result = "mixed";
					break;
				}
			}
		} else if(num == 8) {
			for(int i=0; i<7; i++) {
				if(Integer.parseInt(st.nextToken()) == num - 1) {
					num--;
					if(num == 1) {
						result = "descending";
					}
				} else {
					result = "mixed";
					break;
				}
			}
		} else {
			result = "mixed";
		}
		System.out.println(result);
	}

}