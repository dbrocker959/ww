package com.interview.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.interview.com.AutomationBase;

public class AutomationTest extends AutomationBase {
  public AutomationTest() {
	  super();
  }
	
  @Test
  public void verifyHPtitle(String title) {
	  Assert.assertEquals(getHomePageTitle(),title);
  }
  
  @Test
  public void verifyFindMeetingTitle(String title) {
	  Assert.assertEquals(getFindMeetingTitle(),title);
  }

  public void sendLocation(String zipcode){
	  enterLocationField(zipcode);
  }
  
  public void getSearchResults(int result) {
	  printLocationInfo(result);
  }
}
