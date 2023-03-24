package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeads extends BaseClass {
	
public ViewLeads(ChromeDriver driver) {
		
		this.driver = driver; 
	}

	public ViewLeads verifylead() {
		System.out.println("verified");
		return this;
	}
}
