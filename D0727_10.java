import java.util.Scanner;

public class D0727_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.print("입력1 : ");
		a=scan.nextInt();
		System.out.print("입력2 : ");
		b=scan.nextInt();
		System.out.print("입력3 : ");
		c=scan.nextInt();
		
		if(a==b && b==c &&a==c) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
