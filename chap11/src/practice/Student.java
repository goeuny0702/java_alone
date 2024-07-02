package practice;

public class Student {
	private String studentnum;
	
	public Student(String studentnum) {
		this.studentnum = studentnum;
	}
	
	public String getStudentNum() {
		return studentnum;
}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentnum.equals(student.getStudentNum())) {
				return true;
		}
		return false;
	}
	}
}
	
