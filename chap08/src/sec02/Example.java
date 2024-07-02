package sec02;

public class Example {

	public static void main(String[] args) {
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;	//InterfaceA로 자동형변환
		ia.methodA();	//ImplementationC의 methodA를 실행
		System.out.println();	// 한줄 띄우기
		
		InterfaceA ib = imp1;	//InterfaceB로 자동형변환
		ib.methodA();	//ImplementationC의 methodB를 실행
		System.out.println();	// 한줄 띄우기
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
