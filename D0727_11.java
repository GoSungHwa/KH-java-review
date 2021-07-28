import java.util.Scanner;

public class D0727_11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.print("A사원의 연봉 : ");
		a=scan.nextInt();
		System.out.print("B사원의 연봉 : ");
		b=scan.nextInt();
		System.out.print("C사원의 연봉 : ");
		c=scan.nextInt();
		
		double aMoney=(double)a+(a*0.4);
		double bMoney=(double)b;
		double cMoney=(double)c+(c*0.15);
		
		System.out.printf("A사원의 연봉 :%d/%.1f \n",a,aMoney);
		if(aMoney>=3000) {
			System.out.println("3000만원 이상");
		}else {
			System.out.println("3000만원 미만");
		}
		
		System.out.printf("B사원의 연봉 :%d/%.1f \n",b,bMoney);
		if(bMoney>=3000) {
			System.out.println("3000만원 이상");
		}else {
			System.out.println("3000만원 미만");
		}
		
		System.out.printf("C사원의 연봉 :%d/%f \n",c,cMoney);
		if(cMoney>=3000) {
			System.out.println("3000만원 이상");
		}else {
			System.out.println("3000만원 미만");
		}
		
	}
}
