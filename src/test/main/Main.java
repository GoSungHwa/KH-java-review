package test.main;
import test.clone.CloneEx;
import test.random.RandomEx;
public class Main {

	public static void main(String[] args) {
		new CloneEx().testClone();
//		new EqualsEx().testEquals();
//		new GetClassEx().testGetClass(); 
//		new HashCodeEx().testHashCode();
//		new ToStringEx().testToString();
//		new StringEx().testString();
//		new StringBuffer().testStringBuffer();	
//		Student s1 = new Student("홍길동", 100, 90); 
//		Student s2 = new Student("고길동", 90, 80); 
//		new StuMannager().scoreComp(s1, s2);
		new RandomEx().testRandom();
	}

}
