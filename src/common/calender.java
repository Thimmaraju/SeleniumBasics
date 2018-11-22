package common;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calender  {

	WebDriver driver;

	@Test
	public void enterText() throws InterruptedException{

		String month = "September 2019";
		String day = "20";

		// First step set the driver location
		// For Window user
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WinWire\\eclipse-workspace\\Selenium_basics\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.phptravels.net/");

		driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).click();
		
			Thread.sleep(2000);
		
		while (true) {
			String text = driver
					.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[1]/th[2]"))
					.getText();
			System.out.println(text);
			if (text.equals(month)) {
				break;
			} else {
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/thead/tr/th[3]"))
						.click();
			}
		}

		driver.findElement(
				By.xpath("//div[@class='datepicker dropdown-menu'][1]/div/table/tbody/tr/td[contains(text(),'21')]"))
				.click();
		
	driver.close();
		//Thread.sleep(4000);
		//driver.quit();
		

	}
	
}
