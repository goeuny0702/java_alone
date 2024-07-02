package sec7;

public class DmbCellphone extends Cellphone {
	int channel;
	
	public DmbCellphone() {
		super();	// Cellphone의 기본 생성자 호출
	}
	
	// 생성자
	public DmbCellphone(
			String mode1, 
			String color, 
			int channel) {
		// this.mode1은 Cellphone에 있는 모델
		// 뒤의 mode1은 매개변수 mode1
		// super(); // 해당 코드가 없어도 자동으로 만들어짐
		this.mode1 = mode1;
		this.color = color;
		this.channel = channel;
		
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "빈 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "빈으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("채널" + channel + "빈 DMB 방송 수신을 멈춥니다..");
	}
}
