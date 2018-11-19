import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLogin {

@Test
public void AdminLogin() {
//Instantiate Chrome Browser driver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raju\\git\\SeleniumBasics\\drivers\\chromedriver.exe");
// Create Chrome browser driver in Selenium WebDriver Interface
WebDriver driver = new ChromeDriver();//It launches chrome browser with blank url

driver.get("http://www.gcrit.com/build3/admin/");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.id("tdb1")).click();

String url = driver.getCurrentUrl();

if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
System.out.println("Admin Login is Successful - Passed");	
}
else {
System.out.println("Admin Login Unsuccessful - Falied");
}
//driver.close();
}
}