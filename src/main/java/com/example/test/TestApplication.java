package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(TestApplication.class, args);
	
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		

		
		int result = binarySearch.binarySearch(new int[] { 3, 8, 7 }, 3);
			System.out.println(result);

		
	}
}
