package test.collection;

import java.util.TreeSet;

public class TestTreeSet {
	
	public void testTreeSet() { 
	TreeSet<String> tset = new TreeSet<String>(); 
	tset.add("3. Mybatis"); 
	tset.add("1. Java"); 
	tset.add("5. HTML5"); 
	tset.add("4. Oracle"); 
	tset.add("2. JDBC") ;
	for(String text : tset) { // 앞의 번호 순으로 자동 정렬되어 출력된다. 
	System.out.println(text); 
	} 
	}
}
