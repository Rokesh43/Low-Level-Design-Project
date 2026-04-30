package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	List<Book> books=new ArrayList<Book>();
	
	public void addBook(Book b) {
		books.add(b);
		System.out.println("Book added Sucessfully");
	}
	
	public void veiwBooks() {
		if (books.isEmpty()) {
			System.out.println("Books are Empty");
			
		}
		else {
			for(Book b:books) {
				b.bookDetails();
				
			}
		}
	}
	
	public void updateBook(int id,String newtitle,String newauthor) {
		if (books.isEmpty()) {
			System.out.println("Books are Empty");
			
		}
		else {
			for(Book b:books) {
				if (b.bookId==id) {
					b.title=newtitle;
					b.author=newauthor;
					System.out.println("Upadte successfull");
					
				}
				else {
					System.out.println("Book Id not Found");
				}
			}
		}
		
	}
	
	public void delete(int id) {
		if (books.isEmpty()) {
			System.out.println("Books are Empty");
			
		}
		else {
			for(Book b:books) {
				if (b.bookId==id) {
					books.remove(b);
					System.out.println("Books Deleted Successfully");
					
				}
				else {
					System.out.println("Book Id not Found");
				}
			}
		}
	}
	
	public void sortBook() {
		books.sort((b1,b2)-> b1.title.compareToIgnoreCase(b2.title));
		System.out.println("Book sorted in Name");
	}

}
