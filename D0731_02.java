import java.util.Scanner;

public class D0731_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력해주세요: ");
		int a=scan.nextInt();
		if(a<0) {
			System.out.println("양수만 입력해주세요");
		}
		else if(a/2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		scan.close();
	}

}
