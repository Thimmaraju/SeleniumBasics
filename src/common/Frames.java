package common;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void Frames() throws InterruptedException {
		
			// Instantiate Chrome Browser driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Raju\\git\\SeleniumBasics\\drivers\\chromedriver.exe");
		  	WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        Thread.sleep(10000);
	        driver.switchTo().frame("packageFrame");
	        driver.findElement(By.linkText("Action")).click();
	        //driver.close(); 
	        
	        try{
	        	WebElement txtbox_username = driver.findElement(By.id("username"));
	            }

	        catch(NoSuchElementException nsee){
	                    System.out.println("no such e;lement ");
	         }
	    }
}