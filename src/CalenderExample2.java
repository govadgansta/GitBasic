import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.momondo.com/flights/asia");
		driver.manage().window().maximize();
		Thread.sleep(6000L);
		driver.findElement(By.id("QWKJ-depart-input")).click();
		
		
		//int count=driver.findElements(By.)
	
	}
}
