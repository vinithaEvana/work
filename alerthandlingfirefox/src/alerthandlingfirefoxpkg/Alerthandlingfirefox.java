package alerthandlingfirefoxpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandlingfirefox {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.gecko.driver", "D:\\Selenium Automation\\firefoxdriver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B1")).click();
		
		Thread.sleep(2000);
		
		System.out.println(
	    driver.switchTo().alert().getText());
	    
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.name("B2")).click();
	    
		Thread.sleep(2000);
	    
	    driver.switchTo().alert().dismiss();
	    
	    driver.findElement(By.name("B3")).click();
	    
	    driver.switchTo().alert().sendKeys("Hai");
		Thread.sleep(2000);
	    
	    driver.switchTo().alert().dismiss();
	    
		

		
		
	}

}
