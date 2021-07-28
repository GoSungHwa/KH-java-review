import java.util.Scanner;

public class D0727_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함): ");
		String num=scan.next();
		
		if(num.charAt(7)==1) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
}
