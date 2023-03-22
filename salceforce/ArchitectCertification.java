package salceforce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ArchitectCertification extends Base {
	@Test
	public void architect() {
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		String sumary = driver
				.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center Lh(1.5)')]"))
				.getText();
		System.out.println(sumary);

		List<WebElement> certif = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (WebElement certificates : certif) {

			System.out.println("Saleceforce Architect  certificates    " + certificates.getText());

		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		List<WebElement> appli = driver.findElements(By.xpath("//div[@class='trailMix-card-body_title']"));
		for (WebElement application : appli) {
			System.out.println("certificates in Application architect    "+application.getText());
			
		}
		

	}

}
