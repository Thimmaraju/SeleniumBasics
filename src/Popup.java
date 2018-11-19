import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Popup {
	@Test
    public static void Popup() {
    	
		
		// Instantiate Chrome Browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raju\\git\\SeleniumBasics\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        //driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        //driver.quit();
       
    }
}