package sec02;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exam 3
		/*int var1 = 5;
		int var2 = 2;
		double var3 = var1 / (double)var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4); */
		
		// exam 4
		/* boolean stop = true;
		while(!stop) { 
			
			
		}*/
		
		
		// exam 5
		/*int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsPerStudent); */
		
		
		// exam 6
		/*int value = 365;
		System.out.println((value / 100) * 100); */ 
		// 365 / 100 → 3.65 인데 두 연산자가 일반 int 이기 때문에 소수점은 버려짐.
		
		
		// exam 7
		
		/*float var1 = 10f;
		double var2 = (double)var1 / 100;
		
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}*/
		
		// exam 8
		/*int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (lengthTop + lengthBottom) * height / (double)2;
		System.out.println(area); */
		
		// exam 9 (오류)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수 :");
		double num1 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("두 번째 수 :");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("--------------");
		if(num2 != 0.0) {
			System.out.println("결과: " + (num1 / num2));
		} else {
			System.out.println("결과: 무한대");
		} 
		
		// exam 10
		/* int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이: " + var4); */
	
		
		// exam 11
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("패스워드: ");
		String strPassword = scanner.nextLine();
		
		int password = Integer.parseInt(strPassword);
		if (name.equals("java")) {
			if (password == 1245) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
			} */
		} 
		
		
		
		
	}

