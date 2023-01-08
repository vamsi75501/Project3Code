package guvi_project3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	WebDriver driver;
	WebElement element;
	@BeforeMethod
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//*[@name='password']//following::button")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
		
	}


