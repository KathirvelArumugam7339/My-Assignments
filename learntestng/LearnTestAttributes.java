package learntestng;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnTestAttributes {
	@Test(priority=2)
	public void createLead() {
		System.out.println("Create lead");
	}

	@Test(priority=3)

	public void editLead() {
		System.out.println("Edit lead");
		throw new NoSuchElementException();
	}
	@Test(enabled=false)

	public void mergeLead() {
		System.out.println("Merge lead");
	}
	
	@Test(dependsOnMethods = "EditLead")
	public void findteLead() {
		System.out.println("Find lead");
	}
	
	
	
}
