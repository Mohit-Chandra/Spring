package com.mohit.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //everytime a new instance is returned as a bean
public class BinarySearchImpl {
	
	@Autowired
	//@Qualifier("bubble")
	private SortAlgo bubbleSortAlgo;
	
	//Constructor Injection
//	public BinarySearchImpl(SortAlgo bubbleSortAlgo) {
//		super();
//		this.sortAlgo = bubbleSortAlgo;
//	}

//	public SortAlgo getSortAlgo() {
//		return bubbleSortAlgo;
//	}
//
//	public void setSortAlgo(SortAlgo bubbleSortAlgo) {
//		this.sortAlgo = bubbleSortAlgo;
//	}

	public int binarySearch(int ar[],int key) {
		//BubbleSortAlgo bubblesort = new BubbleSortAlgo();
		
		int []numbers = bubbleSortAlgo.sort(ar);
		System.out.println(bubbleSortAlgo);
		return 3;
	}
}
