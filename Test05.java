import java.util.InputMismatchException;
import java.util.Scanner;

//추상화-값을 저장하는 기능, 동작시켜주는 기능(명령어들의 기능)
class Student { // 참조자료형(형태를 정의해 놓은것)
	String name;
	String tel;
	String sns; // 값 저장
	String birth;
	int height;
	String address;

	public Student(String name, String a, String b, String c, String d) {
		this.tel = a;
		this.sns = b;
		this.birth = c; // 동작
		this.address = d;
	}

}

public class Test05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// 생성,키보드로부터 입력받는 스케너

//		Student hykim = new Student();// new Student():공간확보를 위한 생성자
//		hykim.tel = "0123456789";
//		hykim.sns = "ggggg";
//		hykim.birth = "111111";
//		hykim.height = 71;

		Student hykim = new Student("김현영", "010123456", "ㅗㅗㅗㅠㅗ", "0214", "ㅍㅎㅎㄹ");

		System.out.printf("이름 입력하세요:");
		String name = scan.next();
		System.out.println("입력받은 값은" + name + "입니다");

		System.out.println("입력하세요:");
		String b = scan.next();

		int a;

		try {

			a = scan.nextInt();

			// The local variable a may not have been initialized
			// 초기화가 되어있지않다라는 오류--static이 아닌이상 초기화해줘야함(catch문 떄문에)
			if (a == 0) {
				System.out.println("0은 0입니다.");
			} else if (a % 2 == 0) {
				System.out.println("짝수 입니다.");
			} else {
				System.out.println("홀수 입니다.");
			}

		} catch (InputMismatchException e) {
			System.out.println("정수가 입력되지 않았습니다. 정수만 입력해주세요.");
		}

	}
}
