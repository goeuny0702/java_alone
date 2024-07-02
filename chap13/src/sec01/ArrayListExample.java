package sec01;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// string으로 된 여러개의 객체를 array처럼 사용하도록 arraylist 객체를 생성
		List<String> list = new ArrayList<String>();	//뒤에 arraylist<>안에 클래스이름은 생략이 가능
		// 리스트 원소 추가
		list.add("java");	// "java"값을 가진 String 객체를 0번째 인덱스에 추가 및 저장
		list.add("JDBC"); 	// "jdbc"값을 가진 String 객체를 1번째 인덱스에 추가 및 저장
		list.add("Servlet/JSP"); 	// "Servlet/JSP"값을 가진 String 객체를 2번째 인덱스에 추가 및 저장
		list.add(2, "Database");	// 2번째 인덱스에 "database"값을 가진 string객체를 저장, 3번째 인덱스에 "Servlet/JSP"값을 가진 String 객체를 저장
		list.add("iBatis");		// 4번째 인덱스에 "ibatis"값을 가진 string 객체를 저장
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		
		// 리스트 원소 검색
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();	// 한 줄 띄우기
		
		//리스트의 개수만큼 순화하여 값을 찍음
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println(); // 한 줄 띄우기
		
		
		// 리스트 원소 삭제
		list.remove(2);		// 인덱스 2번의 값을 삭제 -> 데이타베이스 삭제
		list.remove(2);	
		list.remove("iBatis");	
		
		
		// 리스트 개수만큼 순회하여 값을 찍음
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		
		}		
		System.out.println(); // 한 줄 띄우기
		
		// 리스트 원소 수정
		list.set(0, "python");
		// 리스트의 개수만큼 순회하여 값을 찍음
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		
		list.clear();		// 리스트 전부삭제

	}

}
}
