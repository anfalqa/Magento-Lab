package My_magento_lab;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Login_Test_Cases extends Parameters{
	WebDriver driver = new ChromeDriver();
	SoftAssert Assert = new SoftAssert();
	
	
	@BeforeTest
	public void myBeforeTest() {
		driver.get(URLink);	
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
	}
	@Test()
	public void myTest1() {
		
		WebElement UserEmail= driver.findElement(By.id("email"));
		UserEmail.sendKeys(Email);
		WebElement UserPassword= driver.findElement(By.id("pass"));
		UserPassword.sendKeys(Password);
		
		WebElement SignupButton = driver.findElement(By.className("login"));
		SignupButton.click();
		
}
}