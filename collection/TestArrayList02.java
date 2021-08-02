package test.collection;

import java.util.ArrayList;
import java.util.List;


public class TestArrayList02 {
	private List<String> l=new ArrayList<String>();
	
	public void testArrayList() {
		l.add("Red");
		l.add("Orange");
		l.add(1, "Yellow");
		printList();
		
		l.remove(2);
		printList();
		
		l.clear();
		System.out.println("List가 비었나요?"+l.isEmpty());
	}
	public void printList() {
		System.out.println(l);
	}
}
