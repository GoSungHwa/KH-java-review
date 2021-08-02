package test.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
	public void testMap() { 
		Map<String,Integer> map = new HashMap<String,Integer>(); //키가 무조건 integer,String은 아니다 string,string도 가능
		map.put("Apple",2500); 
		map.put("Dandelion",3000); 
		map.put("Corn",2000); 
		map.put("BlackBerry",4000); 
		map.put("BlackBerry",6000);
		
		//Iterator 반복자
		//map.keySet() -키 값들을 set형태로 쭉 넣어줌
		Iterator<String> iterKey = map.keySet().iterator(); 
		while(iterKey.hasNext()) { // 작성한 map 객체를 목록화하여 각각 출력한다 
		String key = iterKey.next(); 
		System.out.println("key: "+key+" : "+map.get(key)); 
		} 
}
}
