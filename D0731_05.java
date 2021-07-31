import java.util.Scanner;

public class D0731_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id0 = "myid";
		String pw0 = "myPassword12";
		System.out.println("아이디:");
		String id = scan.next();

		System.out.println("비밀번호:");
		String pw = scan.next();

		if (id == id0 && pw == pw0) {
			System.out.println("로그인 성공");
		} else if (id != id0) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (pw != pw0) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		scan.close();
	}

}
//제대로된 결과가 안나옴