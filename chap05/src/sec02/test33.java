package sec02;

import java.util.Scanner;

public class test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* exam 3
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println(array[2].length); */
		
		
		/* exam 4
		 int max = 0;
		 int[] array = {1,5,3,8,2};
		 
		 for(int i = 0; i < array.length; i++) {
			 if(max < array[i]) {
				 max = array[i];
			 }
		 }
		 
		System.out.println("max:" + max); */
		
		/* exam 5
		int[][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87,88},
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count =  0;
		for(int i =0; i < array.length; i++) {
			int temp1 = array[i].length;
			
			for (int j = 0; j < temp1 ; j++) {
				sum = sum + array[i][j];
			}
			count += temp1;
		}
		
		
				
		avg = (double)sum / count;
		
		
		
		
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg); */
		
		
		
		// exam 6
		
		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]:" + scores[i]);
		}
			} else if(selectNo == 4) {
				int 최고점수 = 0;
				double 평균점수 = 0.0;
				
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (최고점수 < scores[i]) {
						최고점수 = scores[i];
					}
					sum += scores[i];
				}
				평균점수 = sum / (double)studentNum;
				
				System.out.println("최고 점수:" + 최고점수);
				System.out.println("평균 점수:" + 평균점수);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
		

