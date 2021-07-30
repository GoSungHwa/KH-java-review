package test.vo;

public class Student {
	private String name;
	private int kor;
	private int eng;
	
	

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public int getSum() {
		return kor + eng;
	}

	public String getName() {
		return name;
	}
}
