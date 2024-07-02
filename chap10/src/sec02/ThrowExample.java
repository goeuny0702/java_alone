package sec02;

public class ThrowExample {
	public static void  findclass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findclass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		} catch(NumberFormatException e) {
			System.out.println("설정된 배여의 크기를 넘은 값을 넣었습니다.");
		} finally {
			System.out.println("프로그램이 종료되었습니다");

	}

}
}
