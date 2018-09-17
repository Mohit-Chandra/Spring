package com.mohit.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mohit.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication //It automatically scans the package which it is in and the subpackages
public class SpringIn5StepsBasicApplication {

	//What are the beans?
	//What are the dependencies of a bean..?
	//Where to search for beans..?
	
	public static void main(String[] args) {
		
		//ApplicationContext manages all the beans
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgo());
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearchImpl = 
				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl);
		BinarySearchImpl binarySearchImpl1 = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl1);
		System.out.println(binarySearchImpl.binarySearch(new int[] {5, 2,7,9,0},2));
		
		
	}
}
