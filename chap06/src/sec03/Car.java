package sec03;

public class Car {
	// (만약 기본생성자가 만들어지지 않더라도 내부적으로 기본 생성자가 없다면 자동으로 만들어줌)
	public Car() { 			//기본 생성자 선언
		System.out.println("기본 생성자 출력");
	}
	
	public Car(String model, String color, int maxSpeed) {   // 3개이 인수를 가진 생성자
		System.out.println("인수가 3개인 생성자 출력");
	}
	public Car(String color, int cc) {
		System.out.println("인수가 2개인 생성자 출력");
	}
	
}
