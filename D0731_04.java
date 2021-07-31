import java.util.Scanner;

public class D0731_04 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("1~12 사이의 정수 입력:");
	int dal=scan.nextInt();
	
	switch(dal) {
	case 1:	
	case 2:
	case 12:
		System.out.println(dal+"월은 겨울입니다");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println(dal+"월은 봄입니다");
	case 6:
	case 7:
	case 8:
		System.out.println(dal+"월은 여름입니다.");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println(dal+"월은  가을입니다.");
		break;
		default :
			System.out.println("해당하는 계절이 없습니다.");
	}
}
}
