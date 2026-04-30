package com;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		Library lib=new Library();
		
		boolean flag=true;
		
		do {
			System.out.println("1.Book add");
			System.out.println("2.Update Book");
			System.out.println("3.delete Book");
			System.out.println("4.Sort Book");
			System.out.println("5.Veiw Book");
			System.out.println("6.Exit");
			System.out.print("Choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.print("Enter the Book Id :");
				int bookId=sc.nextInt();
				System.out.println("Enter the Title :");
				String title=sc.next();
				System.out.println("Enter the Author :");
				String author=sc.next();
				
				lib.addBook(new Book(bookId,title,author));
				break;
			}
			case 2:{
				System.out.print("Enter the Book Id :");
				int bookId=sc.nextInt();
				System.out.println("Enter the Title :");
				String title=sc.next();
				System.out.println("Enter the Author :");
				String author=sc.next();
				
				lib.updateBook(bookId, title, author);
				break;
				
			}
			case 3:{
				System.out.print("Enter the Book Id :");
				int bookId=sc.nextInt();
				
				lib.delete(bookId);
				break;
				
			}
			case 4:{
				lib.sortBook();
				break;
			}
			case 5:{
				lib.veiwBooks();
				break;
			}
			case 6:{
				flag=false;
				System.out.println("Thank You");
				break;
			}
			default :{
				System.out.println("Invalid Choice");
				break;
				
			}
			}
		} while (flag);
	}

}
