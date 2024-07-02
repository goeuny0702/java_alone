package sec02;

public class Message {
	public String command;	// 메세지 명령어
	public String to;		// 메세지 전달대상자
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
	

}
