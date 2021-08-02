package test.collection;

import java.util.Set;

public class LinkedHashSet {
	public void testLinkedHashSet() {
		Set<String> set=new java.util.LinkedHashSet<String>();
		set.add("Java"); 
		 set.add("Oracle"); 
		 set.add("JDBC"); 
		 set.add("HTML5"); 
		 //enhanced for
		 //for(새로운 자료형 변수명 : 리스트,셋,맵 형태의 변수 )
		 for(String text : set) { // HashSet과 다르게 값이 들어간 순서대로 출력된다.
		 System.out.println(text); 
		 } 
		 //애초에 담을때 object 형태가 아닌 String 형태에다가 담음(중요!!)
		 //set.toArray()처럼 return type이 object인 경우 대입하는 변수의 자료형을 object
		 //라고하지않고 또한 (String[])set.toArray()처럼 형변환하여 대입시켜줌.		 
		 String[] obj=(String[])set.toArray();
		 System.out.println(obj);
		 for(String text :obj) {
			 System.out.println(text);
		 }
		 System.out.println(obj[2]);
	}
}
