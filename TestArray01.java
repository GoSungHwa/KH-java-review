package tset05;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray01 {

	public void testStar() {
/*1번
 *
 **
 ***
 ****
 */
////		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("*");
//		}
//			System.out.println("");
//		} 
/*2번
 ****
 ***
 **
 *
 */
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
/*3번
      *
     ***
 	*****
   *******
*/
		for(int i=1;i<+5;i++) {
			for(int j=1;j<=i;j+=2) {
			System.out.println("*");
		}
		System.out.println("");
	}
	}
/*4번
 * *
  ***
 *****
  ***
   *
 */

	
	public void testsort() { // 정렬
//		Scanner scan=new Scanner(System.in);
//		int arr[]=new int[3];
//		for(int i=0;i<arr.length;i++) {
//			System.out.print("정수를 입력해주세요:");
//			arr[i]=scan.nextInt();
//		}
		//비교(버블정렬)
		int arr[]= {23,2,4,5,75,3,25,136,34};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<(arr.length-1)-i ;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j]; //swap
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}

	public void test03() {
		String fruit[] = { "사과", "용과", "수박", "참외" };
		String fruit2[] = fruit; // 얕은복사

		// String fruitClone[]=fruit.clone(); //깊은복사 - 이 방식은 속도가 살짝 느림
		// String fruitClone[]=Arrays.copyOf(fruit,fruit.length); //1.깊은복사 - 위방식보다 조금더
		// 빠름
		// String fruitClone[]=new String[fruit.length];//2.깊은복사(이 친구 많이씀 배열에서)
		// System.arraycopy(fruit,0,fruitClone,0,fruit.length);//3.깊은 복사
		// System.arraycopy(fruit,1,fruitClone,2,2);//3.깊은 복사
		// (source,시작위치index,destination(카피될곳),복사할index,총카피할 개수)
		String fruitClone[] = new String[fruit.length];
		for (int i = 0; i < fruit.length; i++) { // 4.깊은복사
			fruitClone[i] = fruit[i];
		}

		fruit[2] = "복숭아";

		System.out.println("=fruit=");
		for (int i = 0; i < fruit.length; i++) {
			System.out.print(fruit[i] + "\t");
		}
		System.out.println("\n=fruit2=");
		for (int i = 0; i < fruit2.length; i++) {
			System.out.print(fruit2[i] + "\t");
		}
		System.out.println("\n=fruitClone=");
		for (int i = 0; i < fruitClone.length; i++) {
			System.out.print(fruitClone[i] + "\t");
		}
	}

	public void test02() {
		int[] arr1 = { 3, 5, 3, 2, 6, 5, 3, 4, 6, 4 };

		// 위 arr1에 잇는 값들을 모두 더해서 출력
		int sum = 0;
		for (int i = 0; i <= arr1.length - 1; i++) {
			sum += arr1[i];
		}
		System.out.println("arr1의 총합은 : " + sum);
	}

	public void test01() {

		Scanner scan = new Scanner(System.in);

		/*
		 * int a1=scan.nextInt(); int a2=scan.nextInt(); int a3=scan.nextInt(); int
		 * a4=scan.nextInt();
		 * 
		 * double avg=(double)(a1+a2+a3+a4)/4; System.out.println("4개 평균 : "+avg);
		 */

		// 배열 : 같은 자료형이고 성향이 같은 값을 넣는 경우
		// 요즘 잘 사용안하지만, 알고리즘으로 많이 나온다(코테).
		// 단점 - 크기의 제한 이 있음
		// - 크기를 정하고 선언, 중간에 크기를 늘리기/줄이기가 어렵다.
		int korScore[] = new int[4];// 4*30=120바이트
		String name[] = new String[30];// 4*30+주소*30

		int sum = 0;
		for (int i = 0; i < 4; i++) {
			korScore[i] = scan.nextInt();
			sum += korScore[i];
		}
		double avg = sum / 4;
		System.out.println("평균 : " + avg);
		
		scan.close();	
	}
}
