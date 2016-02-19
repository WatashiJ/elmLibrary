package com.example.library.backend;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookServiceTest {
	
	static BookService instance;
	
	@Before
	public static void init(){
		BookService.populateBookService(instance,"C:/Users/nickm/workspace/library/src/com/example/library/book-service-config.txt");
		
	}
	@Test
	public void test() {
		assertEquals(instance.count(),0);
	}

}
