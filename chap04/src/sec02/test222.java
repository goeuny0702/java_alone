package sec02;

import java.util.Scanner;

public class test222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* exam 2
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
		  if(i % 3 == 0) {
			sum += i;
		}
	   }
		
		System.out.println("3의 배수의 합: " + sum); */
		
		
		/* exam 3
		while(true) {
			int num1 = (int) (Math.random() * 6 ) + 1;
			int num2 = (int) (Math.random() * 6 ) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if((num1 + num2) == 5) {
				break;
			}
			
		} */

		
		/* exam 4
		for(int x = 1; x <= 10; x++) {
		  for(int y = 1; y <= 10; y++) {
			  if((4 * x)+(5*y) == 60) {
				System.out.println("(" + x + "," + y + ")");
				
			  }
		  }
		} */
		
		
		/* exam 5
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println("*");
				if(j == i) {
					System.out.println(); 
					
				}
			}
		} */
		/* exam 6
		for(int i = 1; i <5; i++) {
			for(int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			System.out.println();
		} */
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner =  new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------");
			System.out.println("선택> ");
			
			int menuNumber = Integer.parseInt(scanner.nextLine());
			
			switch(menuNumber) {
				case 1:
					System.out.println("예금액>");
					balance = balance + Integer.parseInt(scanner.nextLine());
					break;
				case 2:
					System.out.println("출금액>");
					balance = balance - Integer.parseInt(scanner.nextLine());
					break;
				case 3:
					System.out.println("잔고>");
					break;
				case 4:
					run = false;
					break;
					
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
