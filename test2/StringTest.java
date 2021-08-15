package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str="A,b,c,D,a,B,C,d,f,F";
		
		String[] st=str.split(",");     //문자열을 배열로 데이터 분리
		char[] data=new char[st.length]; //st에서 char[]로 바꾸고 배열 할당 선언
		for(int i=0;i<data.length;i++) {
			data[i] = st[i].charAt(0); //배열에 문자 데이터를 넣는다.
		}
		while(true) { // char[] 에서 대문자만 골라서 출력 한다. continue 문 사용할 것
			for(int i=0;i<data.length;i++) {
				if(data[i]>='A' && data[i]<='Z') {
					System.out.println("data["+i+"]:"+data[i]);
					continue;
				}
			}
			break;
		}
	}
	}


