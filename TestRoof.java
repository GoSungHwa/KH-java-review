
public class TestRoof {
	public static void main(String[] args) {
//		int dan = 3;
//		int su=1;

		// while문
//		while(su<=9) {
//			System.out.println(dan+"*"+su+"="+(dan*su));//우선순위 때문에 보기 힘들수 있으니 가독성을 위해 () 쳐주자
//			su++;
//		}

		// for문
//		int dan=7;
//		
//		for(int su=1;su<=9;su++) {
//			System.out.println(dan+"*"+su+"="+(dan*su));
//		}

		// do while(do문장은 조건이 만족하지 않아도 무조건 1번은 수행)

//	 	int dan = 3;
//		int su = 10;  
//		do {
//			System.out.println(dan + "*" + su + "=" + (dan * su));
//			su++;
//		}while(su <= 9) ;		

		// 중첩 while문
//		int dan = 2;
//
//		while (dan <= 9) {
//			int su = 1;
//			while (su <= 9) {
//				System.out.println(dan + "*" + su + "=" + (dan * su));
//				su++;
//			}
//			System.out.println("++++++++"+dan+"단++++++++끝");
//			dan++;
//		}

		// 중첩for문
//		for (int dan = 2; dan <= 9; dan++) {
//
//			for (int su = 1; su <= 9; su++) {
//				System.out.println(dan + "*" + su + "=" + (dan * su) );
//
//			}
//			System.out.println("++++++++"+dan+"단++++++++끝");
//		}
//		for (int su = 1;su<= 9; su++) {
//						for (int dan=2;dan<=9;dan++) {
//							System.out.print(dan + "*" + su + "=" + (dan * su)+ "\t");
//						}
//						System.out.println();
//					}
		// break 예시
//				System.out.println("======break====");
//				for(int su=1; su<=9; su++) {
//					for(int dan=2;dan<=9; dan++) {
//						if(dan == 5) {
//							break;
//						}
//						System.out.print(dan + "*" + su + "=" + (dan * su) + "\t");
//					}
//					System.out.println();
	//			}
		
		// continue 예시
//				System.out.println("======break====");
//				for(int su=1; su<=9; su++) {
//					for(int dan=2; dan<=9; dan++) {
//						if(dan == 5) {
//							continue;
//						}
//						System.out.print(dan + "*" + su + "=" + (dan * su) + "\t");
//					}
//					System.out.println();
//				}

		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i+"출력");
		}
	}
}

