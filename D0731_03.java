import java.util.Scanner;

public class D0731_03 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int han,eng,math;
	
	System.out.print("국어점수 : ");
	han=scan.nextInt();
	System.out.print("영어점수 : ");
	eng=scan.nextInt();
	System.out.print("수학점수 : ");
	math=scan.nextInt();
	
	int sum=han+eng+math;
	double avg=sum/3;
	
	if(han>=40 && eng>=40 &&math>=40 && avg>=60) {
		System.out.println("국어 :"+han+"\n"+"수학:"+math+"\n"+"영어:"+eng+"\n");
		System.out.println("합계:"+sum);
		System.out.println("평균"+avg);
		System.out.println("축하합니다,합격입니다.");
	}else {
		System.out.println("불합격입니다.");
	}
	
	scan.close();
}
}
