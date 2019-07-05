import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examples1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		//driver.findElement(By.xpath("//button[contains(@class,'login-login')]")).click();
		driver.findElement(By.cssSelector("a[class*='login-create']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'register-user-input-password')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile Number')]")).sendKeys("9030908626");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.cssSelector("button[class*='register-register']")).click();
				
	}
	
}
