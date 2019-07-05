import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(6000L);
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		
		while (!driver.findElement(By.xpath("ui-datepicker-month"))
				.getText().contains("January")) {
			driver.findElement(By.xpath(
					"//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']"))
					.click();
		}
		List<WebElement> calender = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for (int i = 0; i < driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size(); i++) {
			if (driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText()
					.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;

			}

		}

	}
}
