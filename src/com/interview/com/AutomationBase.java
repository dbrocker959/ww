package com.interview.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class AutomationBase {
	
	WebDriver driver; 
	
	public AutomationBase() {
		driver = new FirefoxDriver();
	}
	
	public void loadSite(){
		driver.get("https://www.weightwatchers.com/us/");
	}
	
	public String getHomePageTitle(){
		return driver.findElement(By.tagName("title")).getText();
	}
	
	public void clickFindMeeting() {
		driver.findElement(By.id("ela-menu-visitor-desktop-supplementa_find-a-meeting")).click();
	}
	
	public String getFindMeetingTitle(){
		return driver.findElement(By.tagName("title")).getText();
	}
	
	public void enterLocationField(String zip) {
		 WebElement element =  driver.findElement(By.id("meetingSearch"));
		 element.click();
		 element.sendKeys(zip);
		 element.sendKeys(Keys.RETURN);		 
	}
	
	public void printLocationInfo(int position) {
		
		List<WebElement> results = driver.findElements(By.className("meeting-locations-list"));
		String resultsTitle = results.get(position-1).findElement(By.className("location__name")).getText();
		String resultsDistance = results.get(position-1).findElement(By.className("location__distance")).getText();
		Reporter.log("Title for "+ position + ": " + resultsTitle);
		Reporter.log("Distance for "+ position + ": " + resultsDistance);
	}
	

}
