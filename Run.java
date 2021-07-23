package test03;

import java.util.Scanner;

public class Run {
public static void main(String[] args) {
	Member mb1 =new Member();
	mb1.setName("고성화");//메소드 호출
	mb1.setAge(24);
	
	System.out.println(mb1.getName());//메소드 호출
	System.out.println(mb1.getAge());
	
//Converter
	Converter x=new Converter();
	Scanner scan=new Scanner(System.in);
	
	while(true) {
		System.out.println("메뉴를 선택해 주세요:");
		System.out.println("1.cm->inch:");
		System.out.println("2.inch->cm:");
		System.out.println("메뉴선택:");
		int inputmenu=scan.nextInt();
		
		if(inputmenu==1) {
	System.out.println("cm를 inch로 변경하는 프로그램입니다");
	System.out.print("양수를 입력해 주세요");
	int i=scan.nextInt();
	double result=x.cmToInch(i);
	System.out.printf("inch : %f \n",result);
		}else if(inputmenu==2) {
	System.out.println("inch를  cm로 변경하는 프로그램입니다.");
	System.out.print("양수를 입력해 주세요:");
	int y=scan.nextInt();
	double result2=x.inchToCm(y);
	System.out.printf("cm:%f",result2);
		}else {
			System.out.println("끝");
			break;
		}
	}	
	scan.close();
}
}
