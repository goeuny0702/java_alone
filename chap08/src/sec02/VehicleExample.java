package sec02;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run(); //버스가 달립니다.
		//vehicle.checkFare(); //error vehicle 인터페이스에는 checkfare가 없다.
		
		Bus bus = (Bus)vehicle; //강제형변환 
		bus.run();
		bus.checkFare(); // bus에서 checkfare메소드가 존재하므로 실행가능

	}

}
