package common;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WinWire\\eclipse-workspace\\Selenium_basics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("http://qa-mpaforum.azurewebsites.net/");
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Log Out'])[2]/following::a[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Maddie’s Pet Forum'])[4]/following::span[3]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Add Title of Discussion'])[1]/following::text[1]"))
				.click();
		driver.findElement(By.id("Name")).click();
		driver.findElement(By.id("Name")).clear();
		driver.findElement(By.id("Name")).sendKeys("Test Post 45673");
		driver.findElement(By.id("ShelterRescueCategory")).click();
		new Select(driver.findElement(By.id("ShelterRescueCategory"))).selectByVisibleText("Maddie's Fund");
		driver.findElement(By.id("ShelterRescueCategory")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 |
		// ]]
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).click();
		// ERROR: Caught exception [unknown command [editContent]]
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame |
		// relative=parent | ]]
		driver.findElement(By.id("btnPostCreate")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
