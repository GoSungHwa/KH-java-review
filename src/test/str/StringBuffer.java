package test.str;

public class StringBuffer {
	public void testStringBuffer() { 
		/
		
		StringBuffer str1 = new StringBuffer(); 
		StringBuffer str2 = new StringBuffer(30); 
		StringBuffer str3 = new StringBuffer("Java"); 
		//왜 빨간줄이누?
		str1.append("HI"); 
		str2.append("Hello"); 
		str3.insert(0, str2 + " "); 
		
		System.out.println(str1); 
		System.out.println(str2); 
		System.out.println(str3); 
		} 
}
