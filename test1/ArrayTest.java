package ncs.test1;



//1차원 배열에 들어 있는 데이터들의 최대값, 최소값, 짝수의 개수, 홀수의 개수, 합계와 평균을 구

public class ArrayTest {
	public  static int sum(int[] arr) {// 합계 리턴
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static double avg(int[] arr) {// 평균 계산 리턴
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / (double) arr.length;
		return avg;
	}

	public static int max(int[] arr) { // 가장 큰 값 리턴
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int min(int[] arr) { // 가장 작은 값 리턴
		int min = arr[0];
		;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int evenCount(int[] arr) { // 배열에서 짝수 개수 리턴
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount += 1;
			}
		}
		return evenCount;
	}

	public static int oddCount(int[] arr) { // 배열에서 홀수의 개수 리턴
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount += 1;
			}
		}
		return oddCount;
	}

	public static void print(int[] arr) { // 배열 값 출력
		System.out.print("array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	
		int[] array=new int[10];
		for(int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*100+1);
		}
		System.out.println("할당된 배열의 크기 : "+array.length);
		print(array);
		System.out.println("가장 큰 값 : "+max(array));
		System.out.println("가장 작은 값 : "+min(array));
		System.out.println("짝수의 개수 : "+evenCount(array));
		System.out.println("홀수의 개수 : "+oddCount(array));
		System.out.println("합계 :"+sum(array));
		System.out.println("평균 : "+avg(array));
	}
}
