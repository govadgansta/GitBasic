import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.cleartrip.com/");
//		Select s= new Select(driver.findElement(By.id("Adults")));
//		s.selectByValue("8");
//		driver.get("https://www.spicejet.com/");
//		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//a[@value='HYD']")).click();
//		driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
//		driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).click();
	//	driver.get("http://www.echoecho.com/htmlforms10.htm");
		
//		
//	System.out.println(driver.findElement(By.xpath("//input[@id='OneWay']")).isSelected());
//		driver.findElement(By.xpath("//input[@id='OneWay']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='OneWay']")).isSelected());
////		
//		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
//		
//		for(int i=0;i<count;i++)
//		{
////			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
//			if(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value").equals("Cheese"))
//			{
//				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
//				System.out.println("yes");
//			}
////			}
//		driver.get("https://www.cleartrip.com/");
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//a[@id='localsNav']")).click();
		
		
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isEnabled());
		}
		
	}


