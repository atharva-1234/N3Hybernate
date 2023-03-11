package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service=new BookServiceImpl();
		
		System.out.println("Total no.of books: "+service.getCount());
		
		System.out.println("Book with specific Id: "+service.getBookByIds(3));
		
		System.out.println("Price range between 300 to 600: "+service.getPrice(350f, 800f));
		
		System.out.println("Book with specific author: "+service.getBooksAuthor("Atharva"));
		
		System.out.println("All books: "+service.getAll());
	}

}
