package com.interview.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.interview.tests.AutomationTest;


public class MainStart {

	public static void main(String[] args) throws IOException {
		/* Interview questions 1:
		 * Intended to create a dictionary object.  
		 * Load the words and their definitions from the text file.
		 * and Print them out.
		 */
		System.out.println("Please enter path to input file: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String pathInput = reader.readLine();
		
	    //Checks in the file the user provided is actually a file that exists. 
		doesFileExist(pathInput);
		FileReader path = new FileReader(pathInput);
		Dictionary book = new Dictionary(path);
		book.loadWords(path);
		book.printDictonary();
		
		/*Runs an automated test where the automation loads the site, finds list of locations,
		* reports the first location's title and distance. 
		*/
		AutomationTest test = new AutomationTest();
		test.loadSite();
		test.verifyHPtitle("Weight Loss Program, Recipes & Help | Weight Watchers");
		test.clickFindMeeting();
		test.verifyFindMeetingTitle("Get Schedules & Times Near You");
		test.sendLocation("10011");
		test.getSearchResults(1);

		/* Interview question 3: 
		 * Create a method that returns the nth the smallest for 500 randomly generated numbers. 
		 * 
		 */
		RandomNumber num = new RandomNumber();
		int position;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the nth number in a sorted 500 number array:" );
		position = scan.nextInt();
		System.out.println("The "+ position + " slot of a 500 random number sorted array is: " + num.getNthNumber(position));
	}

	public static void doesFileExist(String fileName) throws IOException {
	    FileReader input = new FileReader(fileName);
		
	    try (BufferedReader br = new BufferedReader(input)) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {e.printStackTrace();}
	}
	}
