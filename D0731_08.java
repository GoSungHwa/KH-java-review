import java.util.Scanner;

public class D0731_08 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int a,b;
	String c;
	
	System.out.println("피연산자1 입력:");
	a=scan.nextInt();
	System.out.println("피연산자2입력:");
	b=scan.nextInt();
	System.out.println("연산자입력:");
	c=scan.next();
	
	switch(c) {
	case "+":
		System.out.printf("%d +%d=%d",a,b,a+b);
		break;
	case "*":
		System.out.printf("%d*%d=%d",a,b,a*b);
		break;
	case "-":
		System.out.printf("%d-%d=%d",a,b,a-b);
		break;
	case "/":
		System.out.printf("%d/%d=%f",a,b,(double)a/(double)b);
		break;
	case "%":
		System.out.printf("%d%%d=%d",a,b,a%b);
		break;
	}
}
}
