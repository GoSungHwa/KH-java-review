package test.main;

import test.collection.LinkedHashSet;
import test.collection.TestArrayList02;
import test.collection.TestLinkedList02;
import test.collection.TestTreeSet;
import test.map.PropertiesStudent;
import test.map.StudentManager;
import test.map.TestHashMap;

public class Main {
	public static void main(String[] args) {
//		new TestArrayList02().testArrayList();
//		new TestLinkedList02().testLinkedList();
//		new LinkedHashSet().testLinkedHashSet();
//		new TestTreeSet().testTreeSet(); 
		new TestHashMap().testMap();
		StudentManager stm = new StudentManager(); 
		
		// properties 데이터 삽입 
//		stm.propertyInsert(new PropertiesStudent("1","홍길동",80)); 
//		stm.propertyInsert(new PropertiesStudent("2","김유신",60)); 
//		stm.propertyInsert(new PropertiesStudent("3","신사임당",95)); 
//		// properties 데이터 저장 
//		stm.propertyStore(); 
//		// properties 데이터 입출력 
//		stm.propertyPrint(); 
//
	
		}
}
	
