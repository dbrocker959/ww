package com.interview.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
	Word [] dictonary;
	
	public Dictionary(FileReader file) throws IOException{
		BufferedReader reader = new BufferedReader(file);
		int line = 0; 
		while(reader.readLine() != null) line++; 
		dictonary = new Word[line];
	}
	
	
	/*
	 * Load Words is supposed to take one line from the input file.
	 * First, split it on the dash to separate it from word and its definitions
	 * Second, split it on the comma to get the various definitions.
	 */
	public void loadWords(FileReader file) throws IOException {
		BufferedReader br = null;
		br = new BufferedReader(file);
		String[] inputWords;
		String[] inputMeanings;
		int wordCt = 0;
		
		try {
			do{
				inputWords = br.readLine().split("-");
				System.out.println("Word is: " + inputWords[0].toString());
				dictonary[wordCt].setName(inputWords[0]);
				inputMeanings = inputWords[1].split(",");
				dictonary[wordCt].setDefinition(inputMeanings);
				wordCt++;
			}while(br.readLine()!=null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//prints the dictionary
	public void printDictonary() {
		System.out.println("Your dictonary has the following words and their meaning:");
		for (int i=0;i < dictonary.length;i++) {
			dictonary[i].printWord();
		}
	}

}
