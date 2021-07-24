import java.util.Scanner;

public class D0724_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("나이 : ");
		int age = scan.nextInt();

		if (age > 13 && age <= 19) {
			System.out.println("청소년");
		} else if (age <= 13) {
			System.out.println("어린이");
		}
		scan.close();
	}

}
