package sec7;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = new Parent();
		// Parent.method3(); // Child의 method3
		parent.method2(); 	 // parent의 method2

	}

}
