import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Title_Urls2 {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C://Users//WinWire//Downloads//chromedriver_win32//chromedriver.exe");
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