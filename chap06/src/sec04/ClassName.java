package sec04;

public class ClassName {
	int method1(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int method2() {
		int result1 = method1(10,20);		//내부 메소드 호출
		double result2 = method1(10,20);	//내부 메소드 호출
		return result1;
	}
	

}
