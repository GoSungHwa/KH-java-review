package kh.ppt.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

// document 주석
/**
 * Exception review
 * 
 * @author gosunghwa
 */
public class TestException01 {
	public void test03() {
		BufferedReader ins1 = new BufferedReader(new Reader() {

			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
			}
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		try {
			String s1=ins1.readLine();
			System.out.println(s1);
		}catch(IOException e) {
			System.out.println("IO 오류 발생");
		}finally {
			System.out.println("리드라인동작 마무리");
		}
		System.out.println("프로그램 마침");
	}

	/**
	 * Exception 1 study -Scanner error
	 * 
	 */
	public void testexception01() {

		int a = 0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		System.out.println(a + "aaa");
		sc.close();

	}
}
