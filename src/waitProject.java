import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.xpath("//input[@name='PlaceName']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@name='PlaceName']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		WebDriverWait d= new WebDriverWait(driver,20);
//		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//article[@id='921510']//a[@class='flex-link']")));
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='imgLoading']//span[@title='Loading...']")));
		driver.findElement(By.xpath("//article[@id='921510']//a[@class='flex-link']")).click();
		System.out.println("Test Completed");
	}

}
