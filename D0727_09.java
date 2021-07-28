import java.util.Scanner;

public class D0727_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		System.out.print("정수1 : ");
		num1=scan.nextInt();
		System.out.print("정수2 : ");
		num2=scan.nextInt();
		
		System.out.print("입력 : ");
		int num3=scan.nextInt();
		
		if(num3<=1 || num3>=num2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
