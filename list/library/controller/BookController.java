package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	List<Book> bookList = new ArrayList<>();

	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}

	public void insertBook(Book bk) {
		bookList.add(bk);
	}

	public ArrayList selectList() {

	}

	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}

	}

	public Book deleteBook(String title, String author) {
		Book removeBook=new Book();
		 removeBook = null;
		for(int i=0;i<=bookList.size();i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				bookList.remove(bookList.get(i));
				removeBook = bookList.get(i);
			}
		}
	}

	public int ascBook() {
		return 1;
	}
}
