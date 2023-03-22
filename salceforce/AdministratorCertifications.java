package salceforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdministratorCertifications extends Base {

	@Test
	public void certifications() {
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		System.out.println("Title"  + driver.getTitle());
		List<WebElement> certifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (WebElement allCertificates : certifications) {
			
			System.out.println(allCertificates.getText());

		}

	}

}
