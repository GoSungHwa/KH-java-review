package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc=new Scanner(System.in);
	BookController bc=new BookController();
	
	public void mainMenu() {
		System.out.println("==Welcome SungHwa Library==");
		System.out.println("******메인 메뉴********");
		System.out.println("1.새 도서 추가");
		System.out.println("2.도서 전체 조회");
		System.out.println("3.도서 검색 조회");
		System.out.println("4.도서 삭제");
		System.out.println("5.도서 명 오름차순 정렬");
		System.out.println("9.종료");
		System.out.println("메뉴 번호 선택 : ");
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			insertBook();
			break;
		case 2:
			selectList();
			break;
		case 3:
			searchBook();
			break;
		case 4:
			deleteBook();
			break;
		case 5:
			ascBook();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				mainMenu(); //이렇게 하면 다시 시작하나?
		}
	}
	public void insertBook() {
		System.out.println("*****새 도서 추가******");
		System.out.println("1.도서명 입력받기");
		String title=sc.next();
		System.out.println("2.저자명 입력받기");
		String author=sc.next();
		System.out.println("3.장르 입력받기(숫자로 1.인문/2.자연과학/3.의료/4.기타");
		int category=sc.nextInt();
		System.out.println("4.가격 입력받기");
		int price=sc.nextInt();
		
		String cat=null;
		switch(category) {
		case 1:
			cat="인문";
			break;
		case 2:
			cat="자연과학";
			break;
		case 3:
			cat="의료";
			break;
		case 4:
			cat="기타";
			break;
		}
		Book addbook=new Book(title,author,cat,price);
		
		bc.insertBook(addbook);

		
	}
	public void selectList() {
		bc.selectList();
		ArrayList<Book> bookList=bc.selectList();
		
		if(bookList==null) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i=0;i<=bookList.size();i++) {
				System.out.println(bookList.get(i)+", ");
			}
		}
	}
	public void searchBook() {
		System.out.println("1.검색할 도서명 키워드로 입력 받기");
		String keyword=sc.next();
		
		ArrayList<Book> searchList=bc.searchBook(keyword);
		if(searchList==null) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i=0;i<=searchList.size();i++) {
				System.out.println(searchList.get(i)+", ");
			}
		}
	}
	public void deleteBook() {
		System.out.println("1.삭제할 도서명 입력 받기");
		String title=sc.next();
		System.out.println("2.삭제할 저자명 입력 받기");
		String author=sc.next();
		
		Book remove=bc.deleteBook(title, author);
		if(remove!=null) {
			System.out.println("성공적으로 삭제되었습니다");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	public void ascBook() {
		if(bc.ascBook()==1) {
			System.out.println("정렬에 성공하였습니다.");
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
	
