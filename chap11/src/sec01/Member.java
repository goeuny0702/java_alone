package sec01;


// 내부적으로는 object 클래스를 자동 상속이됨 
public class Member extends Object {
	public String id;
	
	public Member(String id) {
		// super(); // 생략되어있음 (object의 기본생성자)
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		Member member = (Member)obj; // 강제형변환
		
		if(id.equals(member.id))
			return true;
		
		return false;
	}

}
