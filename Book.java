package com;

public class Book {
	 int bookId;
	 String title,author;
	 
	
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}


	public void bookDetails() {
		System.out.println("Book Id :"+bookId+" Title:"+title+" author:"+author);
	}
	

}
