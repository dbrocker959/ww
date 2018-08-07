package com.interview.com;

import java.util.Arrays;

public class RandomNumber {
	
	int [] numbers; 
	
	public RandomNumber() {
		numbers = new int[500];
		for (int i=0;i<numbers.length;i++) {
			numbers[i]=(int)Math.random();
		}
	}
	
	public int getNthNumber(int position){
		Arrays.sort(numbers);
		return numbers[position];
	}

}
