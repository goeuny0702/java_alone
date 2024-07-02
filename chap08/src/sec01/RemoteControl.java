package sec01;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10; // public final static 상수_
	public int MIN_VOLUME = 0; // public final static 상수_
	
	// 생성자 없음
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
