package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MergeLeadsPage clickMaverick() {
		driver.findElement(By.xpath("//a[text()='Maverick']")).click();
		moveToParentWindow();
		return new MergeLeadsPage(driver);
	}

	public void moveToParentWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindows.get(0));
	}

	public MergeLeadsPage clickKumaran() {
		driver.findElement(By.xpath("//a[text()='Kumaran']")).click();
		moveToParentWindow();
		return new MergeLeadsPage(driver);
	}

	public FindLeadsPage clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}
	

}
