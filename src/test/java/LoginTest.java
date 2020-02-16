import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	String baseUrl="https://mail.rediff.com/cgi-bin/login.cgi";
	
	@Test
	public void loginTest() {
		WebDriverManager.chromedriver().setup();
		 
        //Create driver object for Chrome
         driver = new ChromeDriver();
 
        //Navigate to a URL
        driver.get(baseUrl);
        
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
	}
	
	
	

}
