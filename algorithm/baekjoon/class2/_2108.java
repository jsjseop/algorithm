package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 통계학
public class _2108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8001]; // -4000 ~ 4000
		
		int sum = 0;
		int min = 4001;
		int max = -4001;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[num+4000]++;
			
			if(num < min) {
				min = num;
			}
			
			if(num > max) {
				max = num;
			}
		}
		
		// 중앙값
		int medianCnt = 0;
		int median = 5000; // -4000~4000이 아닌 수로 초기화
		// 최빈값
		int modeCnt = 0;
		int mode = 5000; // -4000~4000이 아닌 수로 초기화
		
		boolean flag = false;
		
		for(int i=min+4000; i<=max+4000; i++) {
			
			if(arr[i] > 0) {
				// 중앙값
				// 값의 개수를 누적해서 전체 개수의 반보다 적을 때까지
				if(medianCnt < (N+1)/2) {
					medianCnt += arr[i];
					median = i - 4000;
				}
				
				// 최빈값
				// 현재 값의 개수가 더 많을 경우
				if(arr[i] > modeCnt) {
					//최빈값 수정
					modeCnt = arr[i];
					mode = i - 4000;
					flag = true; // 첫번째 최빈값은 true
				// 같은 최빈값일 경우 flag=true
				} else if(arr[i] == modeCnt && flag == true) {
					mode = i - 4000;
					//두번째 최빈값을 false로 해서 다음 최빈값은 무시하고 
					// 두번째 최빈값을 출력
					flag = false;
				}
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		// 소수점을 버리지 않기 위해 double형으로 계산하고 반올림한다
		sb.append((int)Math.round((double)sum / N)).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(max - min);
		System.out.println(sb);
		
	}

}
