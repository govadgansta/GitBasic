import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Long {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omnexsystems.com/");
		// driver.findElement(By.xpath("//input[@placeholder='Custom
		// Search']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Custom Search']")).sendKeys("Jaguar");
		// driver.findElement(By.xpath("//input[@placeholder='Custom
		// Search']")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//input[@name='sa']")).click();

	}

}
