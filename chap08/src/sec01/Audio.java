package sec01;

public class Audio implements RemoteControl {
	private int volume; //필드(멤버 변수)
	
	public void turnOn() {	// remotecontrol에 있는 turnon 메소드
		System.out.println("Audio를 킵니다");
	}
	public void turnOff() {	// remotecontrol에 있는 turnoff 메소드
		System.out.println("Audio를 끕니다");
	}
	public void setVolume(int vol) {	// remotecontrol에 있는 setVolume 메소드
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = vol;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

}
