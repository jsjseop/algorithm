package class3;

import java.io.IOException;

public class FloydWarshall {

	public static void main(String[] args) throws IOException {
		
		int INF = 10000000;
		// 초기 배열
		int a[][] = {
				{0, 5, INF, 8},
				{7, 0, 9, INF},
				{2, INF, 0, 4},
				{INF, INF, 3, 0}
		};
		
		// 최단 경로 업데이트
		// k = 거쳐가는 노드
		for(int k=0; k<4; k++) {
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					if(a[i][k] + a[k][j] < a[i][j]) {
						a[i][j] = a[i][k] + a[k][j];
					}
				}
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
