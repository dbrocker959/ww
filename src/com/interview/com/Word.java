package com.interview.com;

public class Word {

	String title;
	String [] define;
	
	public Word(){
		title = new String();
	}
	
	//sets the actual world
	public void setName(String n) {
		title = n;
	}
	
	//given an array of meaning, it will just clone/copy it to this words definition variable.
	public void setDefinition(String [] definition) {
		define = definition.clone();
	}
	
	//prints the word and meaning
	public void printWord() {
		String meaning = title;
		meaning.concat(" - ");
		for (int i=0;i < define.length;i++) {
			meaning.concat(define[i]);
			if (i != define.length)
				meaning.concat(",");
		}
		System.out.println(meaning);
	}
	
}
