package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions builder=new Actions(driver);

		//moveToElement
		WebElement mousehover = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		builder.moveToElement(mousehover).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(count);
//		
//		driver.navigate().to("https://jqueryui.com/selectable/");
//		dragAndDrop
//		
//		driver.findElement(By.xpath("//a[text()='Draggable']")).click();		
//		driver.switchTo().frame(0);
//		WebElement drag = driver.findElement(By.id("draggable"));
//		builder.dragAndDropBy(drag, 130, 150).perform();
//		driver.switchTo().defaultContent();
//		
		
		//slecetfrom to
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		
		WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement ele6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		builder.clickAndHold(ele1).moveToElement(ele6).release().perform();
		driver.switchTo().defaultContent();
		
		
		
	}

}
