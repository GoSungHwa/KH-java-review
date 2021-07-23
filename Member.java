package test03;

public class Member {
	public String name; //틀이기 때문에 선언만 한다.
	public int age;

	public Member() {

	}
	//메소드 정의 부분
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
