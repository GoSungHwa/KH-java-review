import java.util.Scanner;

public class D0731_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("키(m)를 입력해 주세요:");
		double key = scan.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요:");
		double kg = scan.nextDouble();

		double bmi = kg / (key * key);
		System.out.println("BMI 지수:" + bmi);
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비반");
		} else if (bmi >= 30) {
			System.out.println("고도비만");
		}
		scan.close();
	}

}
