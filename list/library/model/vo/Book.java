package com.kh.practice.list.library.model.vo;

public class Book {
	String title;
	String author;
	String category;
	int price;
	
	public Book() {
		
	}
	public Book(String title, String author,String category,int price) {
		this.title=title;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	public int hashCode() {
		return hashCode();
	}
	public boolean equals() {
		return equals();
	}
	public int comparTo() {
		return comparTo();
	}
}
