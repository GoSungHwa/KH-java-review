import java.util.Scanner;

public class Test06 {
	//리턴 자료형 메소드() {
		//return 리턴값;
		//}
		int aaa() {
			Scanner scan=new Scanner(System.in);
			int s=scan.nextInt();
			System.out.println("나는 int형을 리턴 할 메소드입니다.");
			return s;
		}
		String ccc() {
			return "안녕";
		}
		double ddd() {
			double d = 3.14;
			return d;
		}
		
		void eee() {
			return;  //생략가능함.(메소드 마지막에 적힌 return)
		}
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int a;
//		System.out.println("정수를 입력하세요:");
		
		int b=7;
		if(b==0) {
			System.out.println("0입니다");
		}else {
			if(b>0) {
				if(b%2==0) {
				System.out.println("짝");	
				}else {
					System.out.println("홀");
				}
			}
		}
		
		
		

//		try {
//
//			a = scan.nextInt();
		
		//singleton(싱글톤)패턴 - 스캐너?가 여러개 생성하는걸 방지해주는 패턴?
//
//			// The local variable a may not have been initialized
//			// 초기화가 되어있지않다라는 오류--static이 아닌이상 초기화해줘야함(catch문 떄문에)
//			if(a==0) {
//				System.out.println("0은 0입니다.");
//			} else {
//				if(a%2 == 0) {
//					System.out.println("짝수 입니다.");
//				} else {
//					System.out.println("홀수 입니다.");
//				}
//			}
//
//
//		} catch (InputMismatchException e) {
//			System.out.println("정수가 입력되지 않았습니다. 정수만 입력해주세요.");
//		}

		int c=10;
		if(c==0) {
			System.out.println("0");  //return : 끝나는 중괄호로 이동(메소드를 빠져나간다)
			return;                   //나를 포함하고 있는 메소드가 끝이남.
		}
		if(c % 2 == 0) {
			System.out.println("짝");
			return;
		}
		if(c % 2 != 0) {
			System.out.println("홀");
			return;
		}
		scan.close();
	}

}
