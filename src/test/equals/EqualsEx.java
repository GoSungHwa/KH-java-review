package test.equals;

public class EqualsEx {
	public void testEquals() {
		String str1 = new String("Apple");
		String str2 = new String("Apple");

		System.out.println("str1==str2:" + (str1 == str2));
		System.out.println("str1.equals(str2):" + str1.equals(str2));
	}
}
