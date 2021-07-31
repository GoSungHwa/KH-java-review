import java.util.Scanner;

public class D0731_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1.입력 \n 2.수정 \n 3.조회 \n 4.삭제 \n 7.종료");
		System.out.println("메뉴를 입력하세요:");
		int num = scan.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;

		default:
			System.out.println("없는 번호 입니다.");
			break;

		}
		scan.close();
	}
}
