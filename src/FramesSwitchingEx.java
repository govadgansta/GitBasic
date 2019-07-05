import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSwitchingEx {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://toolsqa.com/iframe-practice-page/");
		// driver.manage().window().maximize();
		// Thread.sleep(6000L);
		// int number=FramesSwitchingEx.findFrameI(driver,
		// By.xpath("//a[@class='dt-mobile-menu-icon']"));
		// driver.switchTo().frame(number);
		// driver.findElement(By.xpath("//a[@class='dt-mobile-menu-icon']")).click();

		// Handling Autosuggestive dropdown

		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("ana");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"src\").value;";
		String value = (String) js.executeScript(script);
		System.out.println(value);

		while (!value.equalsIgnoreCase("Anantapur Bypass")) {
			driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
			value = (String) js.executeScript(script);
			
		}
	}

	public static int findFrameI(WebDriver driver, By by) {
		int i;

		int fcount = driver.findElements(By.tagName("iframe")).size();
		for (i = 0; i < fcount; i++) {
			int ecount = driver.findElements(by).size();

			if (ecount > 0) {
				break;
			}

		}

		driver.switchTo().defaultContent();

		return i;
	}

}
