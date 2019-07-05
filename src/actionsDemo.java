import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		Actions a = new Actions(driver);
//		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']"));
//		WebElement text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		a.moveToElement(move).build().perform();
//		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("helooo").doubleClick().build().perform();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		actionsDemo a= new actionsDemo();
		
		String childid=a.returnSample(driver);
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@itemprop='title']")).click();
		Set<String> st=driver.getWindowHandles();
		
		String tchildid=a.returnSample(driver);
		driver.switchTo().window(tchildid);
		System.out.println(driver.getTitle());
		
		
		
	}
	public String returnSample(WebDriver driver) {
		Set<String> s=driver.getWindowHandles();
		Iterator i=s.iterator();
		Iterator it=s.iterator();
		it.next();
		String windowid=(String) it.next();
		return windowid;
		
	} 

}
