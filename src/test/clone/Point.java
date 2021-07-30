package test.clone;

public class Point implements Cloneable {// clone 함수를 재정의하려면 cloneable 인터페이스 상속받아야함
	private int posX;
	private int posY;
	
	public Point(int posX,int posY) {
		this.posX=posX;
		this.posY=posY;
	}
	@Override  //clone 메소드 재정의    객체를 복사하여 반환
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
