package kh.ppt.exception;



public class Run {
	public static void main(String[] args) {
//		new TestException01().testexception01();
//		new TestException01().test03();
		
//		ThrowsTest tt=new ThrowsTest();
		
//		tt.methodA(); //위임을 받았기 떄문에 이렇게 말고  try-catch로 해줘야함
		
//		try {
//			tt.methodA();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("종료");
//		new TestTryCatch().method();
		
		UserExceptionTest uet=new UserExceptionTest();
		try {
			uet.method();
		}
		catch(UserException e) {
			e.printStackTrace();
		}
	}
}
