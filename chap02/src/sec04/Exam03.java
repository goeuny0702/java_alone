package sec04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("[필수 정보 입력]");
	
	System.out.print("1. 이름: 홍길동 ");
	String name = scanner.nextLine();
	
	System.out.print("2. 주민번호 앞 6자리: 123456 ");
	String ssn = scanner.nextLine();
	
	System.out.print("3. 전화번호: 010-123-1234" );
	String tel = scanner.nextLine();
	
	System.out.println();

	
	}

}

