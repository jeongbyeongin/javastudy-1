package ex02_List;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void ex01() {
		
		// 배열 리스트(ArrayList) 선언 및 생성
		List<String> list = new ArrayList<String>();
		
		// 추가
		list.add("summer");  // 인덱스의 지정이 없으면 항상 마지막에 추가됨
		list.add("autumn");
		list.add("frog");
		list.add("winter");
		list.add(0, "spring");  // 인덱스 0에 spring 추가됨
		
		// 수정
		list.set(2, "fall");  // 인덱스 2의 요소를 fall로 수정함
		
		// 삭제
		// list.remove("frog");  // 삭제할 대상을 전달
		list.remove(3);  // 삭제할 대상의 인덱스를 전달
		
		// 확인
		System.out.println(list);
		
	}
	
	public static void main(String[] args) {
		ex01();
	}

}
