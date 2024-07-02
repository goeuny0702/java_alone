package practice;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		//obj3.intValue() -> primitive 타입으로 변환
		//obj4.intValue() -> primitive 타입으로 변환
		//obj3.intValue() == obj4.intValue()
				
	   // byte 범위에서까지는 같은데 그 이외(127을 넘어가면)에는 같지 않음
	   // p525 참고
	   System.out.println(obj1 == obj2); //true
	   System.out.println(obj3 == obj4); //false
				

	}

}
