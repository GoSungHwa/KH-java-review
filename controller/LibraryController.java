package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem=null;
	private Book[] bList= new Book[5];
	
	
			
	
	
	public  void insertMember(Member mem) {
		
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
//	public Book[] searchBook(String keyword) {
//		Book[] result=new Book[5];
//		for(int i=0;i<=bList.length;i++) {
//			if(bList[i].getTitle().contains(keyword)) {
//				/*count를 이용해 검색결과의 도석목록 담기 이해가 안돼요
//			}
//			return result;
//		}
//	}
	public int rentBook(int index){
		int result=0;
		
		AniBook.bList(index);
	}
}
