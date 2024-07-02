package sec7;

public class Cellphone {
	
	// 필드
	String mode1;
	String color;
	
	public Cellphone() {
		System.out.println("CellPhone() 생성자 호출됨");
	}
	
	// 메소드
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("자기: " + message); }
	void receiveVoice(String message) { System.out.println("상대방: " + message); }
	void hangUp() { System.out.println("전화를 끊습니다."); }

}
