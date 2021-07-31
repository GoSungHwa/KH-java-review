import java.util.Scanner;

public class D0731_09 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("중간고사 점수:");
	int midExam=scan.nextInt();
	System.out.println("기말 고사 점수:");
	int finalExam=scan.nextInt();
	System.out.println("과제점수");
	int work=scan.nextInt();
	System.out.println("출석 회수: ");
	int go=scan.nextInt();
	
	System.out.println("=========결과=========");
	double result=(midExam*0.2)+(finalExam*0.3)+(work*0.3)+(go*0.2);
	
	System.out.println("중간고사 점수(20):"+midExam);
	System.out.println("기말고사 점수(30)::"+finalExam);
	System.out.println("과제 점수(30):"+work);
	System.out.println("출석 점수(20):"+go);
	System.out.println("총점:"+result);
	
	if(go<=20*0.3) {
		System.out.println("Fail");
	}
	else if(result>=70) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail[점수미달]");
	}
	
}
}
