package assessmentPart2;

public class Student {

	private String stuName;
	private int stuId;
	private String stuBootcamp;
	
	

	public Student(String stuName, int stuId, String stuBootcamp) {
		
		this.stuName = stuName;
		this.stuId = stuId;
		this.stuBootcamp = stuBootcamp;
	}



	public String getStuName() {
		return stuName;
	}



	public void setStuName(String stuName) {
		this.stuName = stuName;
	}



	public int getStuId() {
		return stuId;
	}



	public void setStuId(int stuId) {
		this.stuId = stuId;
	}



	public String getStuBootcamp() {
		return stuBootcamp;
	}



	public void setStuBootcamp(String stuBootcamp) {
		this.stuBootcamp = stuBootcamp;
	}
	
	
	
	
}


