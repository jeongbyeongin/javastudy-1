package ex01_one_dim;

public class Ex01_array {

	/*
		배열이란?
		1. 여러 개의 변수를 하나의 이름으로 관리하는 자료 구조
		2. 배열의 구성 요소
			1) 배열명 : 모든 변수의 대표 이름
			2) 인덱스 : 각 변수를 구분하기 위한 위치 정보. 0부터 시작하는 정수값.
	*/
	
	/*
		배열의 사용 방법
		1. 배열의 선언
			1) int[] arr;  // 권장
			2) int arr[];
		2. 배열의 생성
			arr = new int[5];
	*/
	
	/*
		배열 요소
		1. 배열의 각 변수를 의미
		2. 배열명[인덱스]
		3. 배열이 생성되면 자동으로 초기화된다.
			0, 0.0, false, null 값으로 초기화된다.(값이 없음을 의미)
	*/
	
	public static void ex01() {
		
		// 배열 선언
		int[] arr;
		
		// 배열 생성
		arr = new int[5];
		
		// 배열 요소
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	}
	
	public static void ex02() {
		
		// 배열 선언 + 생성
		int[] arr = new int[5];
		
		// 배열 요소 순회(하나씩 접근하기)
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		ex02();
	}

}
