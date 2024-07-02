package sec7;

public class Child extends Parent {
	void method3() {
		System.out.println("Child의 method3");
		
	}
	
	@Override
	void method2() {
		System.out.println("Child의 method2");
		super.method2(); // 부모클래스의 코드를 method2 호출
		
	}

}
