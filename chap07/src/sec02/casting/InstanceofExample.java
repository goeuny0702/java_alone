package sec02.casting;

public class InstanceofExample {
	// 부모 클래스를 자식 클래스 강제형번환을 안전하게 리턴하는 메소드
	public static Child method1(Parent parent) {
		Child child = null;
		
		if(parent instanceof Child) {
			child = (Child) parent; // 강제형변환
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
		return child;
	}
	public static Child method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child 변환성공");
		
		return child;
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		//method1(new Child()) // instanceof → true
		//method1(new Parent())// instanceof → false
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // ClassCastingException이 발생됨
		
		

	}

}
