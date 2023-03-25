package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MergeLeadsPage extends BaseClass {

	public MergeLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadsPage clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		moveWindow();
		return new FindLeadsPage(driver);
	}

	public void moveWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindows.get(1));
	}

	public FindLeadsPage clickToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		moveWindow();
		return new FindLeadsPage(driver);
	}

}
