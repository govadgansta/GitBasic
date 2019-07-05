import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		System.out.println("Completed");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		System.out.println("Completed");
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println(size);
		WebElement sidesection = driver.findElement(By.xpath("//div[@class='demo-list']"));

		System.out.println(sidesection.findElements(By.tagName("a")).size());
		
		WebElement table=driver.findElement(By.id("sidebar"));
		table.findElement(By.xpath("//div[@id='sidebar']//aside[1]"));
	}
}
