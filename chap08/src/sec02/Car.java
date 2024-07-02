package sec02;

public class Car {
	Tire frontLeftTire = new HankookTire();	//인터페이스 자동형변환
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backtRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backtRightTire.roll();
	}

}
