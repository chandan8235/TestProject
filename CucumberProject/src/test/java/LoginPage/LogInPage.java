package LoginPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runners.model.InvalidTestClassError;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {
	WebDriver driver;

	public void OpenURL() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chand\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	public void EnterUserName() {
		driver.findElement(By.id("email")).sendKeys("guptac64@gmail.com");
	}

	public void EnterValidPassword() {
		driver.findElement(By.id("pass")).sendKeys("8235008583@Ch");
	}

	public void ClickOnLogin() {
		driver.findElement(By.name("login")).click();
	}

	public void verifyLogin() {
		Assert.assertTrue(true);
		//File scr= ((TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);
	}

	public void EnterInvalidUserName() {
		driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
	}

	public void EnterinValidPassword() {
		driver.findElement(By.id("pass")).sendKeys("98765433223");
	}

}
