import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Title_Urls2 {
	@Test
    public void Title_Urls2() {
		// Instantiate Chrome Browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raju\\git\\SeleniumBasics\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.google.com/";
        String tagName = "";
        driver.get(baseUrl);
        driver.findElement(By.className ("gb_b gb_ec")).click();
        //System.out.println(tagName);
        //driver.close();
        ///System.exit(0);
}
}