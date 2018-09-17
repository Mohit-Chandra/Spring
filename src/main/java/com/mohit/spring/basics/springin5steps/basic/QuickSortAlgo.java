package com.mohit.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {

	@Override
	public int[] sort(int[] ar) {
		// TODO Auto-generated method stub
		System.out.println("In QuickSort");
		return ar;
	}

}
