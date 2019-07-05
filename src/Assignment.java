import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Assignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		
//		DesiredCapabilities ch=DesiredCapabilities.chrome();
//		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		ChromeOptions c=new ChromeOptions();
//		c.merge(ch);
		WebDriver driver = new ChromeDriver();
		//driver.get("https://mywork.amfam.com/vpn/index.html");
//		driver.get("http://www.qaclickacademy.com/practice.php");
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
//		String script = "return document.getElementById(\"autocomplete\").value;";
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String value=(String) js.executeScript(script);
//		
//		while(!value.equalsIgnoreCase("India"))
//		{
//			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ARROW_DOWN);
//			value=(String) js.executeScript(script);
//		}
	
			
		driver.get("http://www.espncricinfo.com/series/19019/scorecard/1165045/england-lions-vs-pakistan-a-5th-unofficial-odi-eng-lions-in-uae-2018-19");
		WebElement table=driver.findElement(By.cssSelector("div[class='scorecard-section batsmen']"));
		int count=table.findElements(By.cssSelector("div[class='scorecard-section batsmen'] div:nth-child(3)")).size();
		driver.manage().window().maximize();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F://Learnings/Screenshot.jpeg"));
		System.out.println("Screenshot successfull");
//		for(int i=1;i<count;i++)
//		{
//			System.out.println(table.findElements(By.cssSelector("div[class='scorecard-section batsmen'] div:nth-child(3)")).get(i).getText());
//				
//		}
//		
	}

}
