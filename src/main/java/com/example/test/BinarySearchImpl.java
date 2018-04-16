package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	public int binarySearch(int[] numbers, int numberToSearchFor){
		
		//Implement Sorting logic 
	
		int sortedNumbers[] = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		//Search Array 
		
		return 3;
	  
	}

}
