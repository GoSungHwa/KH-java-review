import java.util.Scanner;

public class D0727_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int math,eng,han;
		
		System.out.print("국어 : ");
		han=scan.nextInt();
		System.out.print("영어 : ");
		eng=scan.nextInt();
		System.out.print("수학 : ");
		math=scan.nextInt();
		
		int sum=han+eng+math;
		System.out.println("합계 : "+sum);
		double avg=(double)sum/3;
		System.out.println("평균 : "+avg);
		if(han>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}

}
