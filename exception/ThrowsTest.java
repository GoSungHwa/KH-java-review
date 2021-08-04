package kh.ppt.exception;

import java.io.IOException;

public class ThrowsTest {
	public void methodA() {
		try {
		methodB();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("B 종료~");
	}
	public void methodB() throws IOException{
		methodC();
	}
	public void methodC() throws IOException{
		throw new IOException(); //IOException 공간을 만들어서 던진다?
	}

}
