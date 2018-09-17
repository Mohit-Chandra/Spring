package com.mohit.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo{

	public int[] sort(int[] ar) {
		// TODO Auto-generated method stub
		return ar;
	}

}
