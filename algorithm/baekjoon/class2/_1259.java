package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1259 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			
			String result = "yes";
			for(int i=0; i<(str.length()/2); i++) {
				if((str.charAt(i)) != (str.charAt(str.length()-1-i))) {
					result = "no";
					break;
				}
			}
			sb.append(result).append("\n");
		}
		br.close();
		
		System.out.println(sb);

	}

}
