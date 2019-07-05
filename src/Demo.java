import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Study\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNAzxMjIwNjLwsQp0MDBw9PUOd3HwdDQwMjIEKIoEKDHAARwNC-sP1o_ArMYIqwGNFQW6EQaajoiIAVNL82A!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/?_ga=2.185806315.350397168.1538318442-2110032093.1504075447");
//		String title=driver.getTitle();
//		System.out.println(title);
//		System.out.println(driver.getCurrentUrl());
//		//System.out.println(driver.getPageSource());
//		
//		driver.get("https://mywork.amfam.com");
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
//	driver.findElement(By.linkText("Forgotten account?")).click();;
//	driver.navigate().back();
//	
//		driver.get("https://login.salesforce.com");
//		driver.findElement(By.id("username")).sendKeys("test");
//		driver.findElement(By.name("pw")).sendKeys("test");
//		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
////		driver.findElement(By.className("button r4 wide primary")).click();
		driver.get("https://auth.uber.com/login/?breeze_local_zone=dca1&next_url=https%3A%2F%2Friders.uber.com%2F&state=6T5P_lDU984GGCPAYCyRg044bZzdFQ23RlkWnPnsRoI%3D");
		driver.findElement(By.xpath("//*[@id=\'useridInput\']")).sendKeys("66235");
		driver.findElement(By.cssSelector("#app-body > div > div:nth-child(1) > form > button")).click();
		String error=driver.findElement(By.cssSelector("div#error-caption")).getText();
		System.out.println(error);
	}

}
