package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 나이순 정렬
public class _10814 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// Person클래스 배열을 생성하여 값들을 저장
		Person[] arr = new Person[N];
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		// Comparator를 이용한 정렬 구현
		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age	;
			}
		});
		
		// 람다식으로 간단하게 표현 가능
		Arrays.sort(arr, (Person p1, Person p2) -> {
			return p1.age - p2.age;
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(Person val : arr) {
			sb.append(val.toString());
		}
		
		System.out.println(sb);
		
	}
	
	public static class Person {
		
		int age;
		String name;
		
		Person(int age, String name){
			this.age = age;
			this.name = name;
		}
		
		// toString()을 이용하여 원하는 형식으로 출력
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
	}

}
