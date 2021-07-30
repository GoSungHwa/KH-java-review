package test.clone;

public class CloneEx {
	public void testClone() {
		Point p1=new Point(10,20);
		Point p2=p1; //얕은복사
		Point p3=null;
		
		try {
			p3=(Point)p1.clone(); //깊은복사
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//p2는 주소를 공유하므로 영향을 받지만, p3는 영향을 받지 않음
		p1.setPosX(111);
		p1.setPosY(222);
		
		System.out.println("p1 = " + p1 + " : (" + p1.getPosX() + ", " + 
				p1.getPosY() + ")"); 
				System.out.println("p2 = " + p2 + " : (" + p2.getPosX() + ", " + 
				p2.getPosY() + ")"); 
				System.out.println("p3 = " + p3 + " : (" + p3.getPosX() + ", " + 
				p3.getPosY() + ")");
	}
}
