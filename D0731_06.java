import java.util.Scanner;

public class D0731_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String m=scan.next();
		
		if(m=="관리자") {
			System.out.println("회원관리,게시글 관리,게시글 작성,게시글 조회,댓글 작성");
		}else if(m=="회원") {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(m=="비회원") {
			System.out.println("게시글 조회");
		}
		
	}

}
//애도 equasl?

