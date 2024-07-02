package sec01;

public class Member {
	public String name;
	public int age;
	
	public Member(String id) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; // 강제형변환
		
			return member.name.equals(this.name) && member.age == this.age;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
