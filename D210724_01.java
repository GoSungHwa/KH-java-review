import java.util.Scanner;
public class D210724_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("이름:");
		String name = scan.next();
		
		System.out.println("학년(숫자만):");
		int grade=scan.nextInt();
		
		System.out.println("반(숫자만):");
		int cls=scan.nextInt();
		
		System.out.println("번호(숫자만):");
		int num=scan.nextInt();
		
		System.out.println("성별(M/F):");
		String gender=scan.next();
		
		System.out.println("성적(소수점 아래 둘째자리까지):");
		double level=scan.nextDouble();
		
		if(gender=="M") {
			gender="남학생";
		}else {
			gender="여학생";
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다",grade,cls,num,name,gender,level);
		scan.close();
	}
}
