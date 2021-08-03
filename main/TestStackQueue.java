package test.main;

import java.util.Stack;


class HashMapBB{ 
	public <K1,V1> void put(K1 a, V1 b) {
		 //와일드카드 ??
	}
}

public class TestStackQueue {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>(); // 참조 자료형을 넣어줘야함
		// Stack<Integer> s=new Stack<>(); 이렇게 써도댐 보통 이렇게 쓴대
		s.push(35);
		s.push(45);//집어넣는다
		System.out.println(s);
		s.pop();//뺸다
		System.out.println(s);
		
		int a=s.peek();//마지막 값을 꺼내서 보여준다.
		System.out.println("a:"+a);
		System.out.println(s);
	}
}
