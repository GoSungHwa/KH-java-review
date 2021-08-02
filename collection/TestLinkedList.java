package test.collection;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		//ArrayList 와 Vector는  동일한 내부구조를 가지고있다.
				LinkedList<String> arrStr = new LinkedList<String>();// 가변 길이로 배열이 만들어진다.
				System.out.println(arrStr.size());// 배열은 length, 가변배열은 size로 길이 확인
				if(arrStr.isEmpty()) {
					System.out.println("arrStr이 Empty 상태임");//컬렉션이 비어있는지 확인
				}
//				if(arrStr.size()==0) {
//					System.out.println("arrStr이 Empty 상태임.");// Empty 메소드랑 같음
//				}
				
				arrStr.add("first");
				arrStr.add("second");
//				arrStr[2]="third";//이렇게는 안댐
				System.out.println(arrStr);
				arrStr.add(1, "1.5"); // 1번 인덱스에다가 추가된다.second는 뒤로 밀려남.
				System.out.println(arrStr);
				System.out.println(arrStr.get(2));//인덱스 2번 읽어줌
				
				String removeStr = arrStr.remove(1);// 인덱스 1 삭제
				System.out.println(removeStr);
				System.out.println(arrStr);

				boolean removeResult = arrStr.remove("1.5"); //자료형이 string이라 문자열로
				System.out.println(removeResult); //false 나옴 1.5가 이미 삭제되어있기때문
				System.out.println(arrStr);
				
				boolean removeResult2=arrStr.remove("first");
				System.out.println(removeResult2);
				System.out.println(arrStr);
				
				arrStr.set(0, "rename");
				System.out.println(arrStr);
				
				if(arrStr.contains("rename"));{ //객체 검색 (저장되어있는지)
					System.out.println("arrStr에는  first라는 값을 가지고 있따.");
				}
				
			
			

	}

}
