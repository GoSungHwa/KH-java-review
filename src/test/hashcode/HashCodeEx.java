package test.hashcode;

import test.clone.Point;

//객체가 할당 받은 메모리에 맵핑되는 유일한 정수를 해시값으로 반환
public class HashCodeEx {
	public void testHashCode() {
		Point point=new Point(10,20);
		
		System.out.println(point.hashCode());
		
		class Point { // Point 객체를 선언하여 hashCode 재정의 
			int posX; 
			int posY; 
			
			public Point(int posX, int posY) { 
			this.posX = posX; 
			this.posY = posY; 
			} 
			@Override 
			public int hashCode() { // hashCode 메소드 재정의 
				
			return  super.hashCode();
			
	}
		}
	}
}
