package sec02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
		//	Class clazz = Class.forName("sec02.TryCatchFinallyExample");
			Class clazz = Class.forName("String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다");
					
		}
		System.out.println("프로그램 종료");
	}

}
