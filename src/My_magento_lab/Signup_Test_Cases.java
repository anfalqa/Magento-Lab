package My_magento_lab;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
public class Signup_Test_Cases extends Parameters  {
	WebDriver driver = new ChromeDriver();
	SoftAssert Assert = new SoftAssert();
	
	
	@BeforeTest
	public void myBeforeTest() {
		driver.get(URLink);	
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	}
	@Test()
	public void myTest1() {
		WebElement UserFirstName= driver.findElement(By.id("firstname"));
		UserFirstName.sendKeys(FName);
		WebElement UserLastName= driver.findElement(By.id("lastname"));
		UserLastName.sendKeys(LName);
		WebElement UserEmail= driver.findElement(By.name("email"));
		UserEmail.sendKeys(Email);
		WebElement UserPassword= driver.findElement(By.id("password"));
		UserPassword.sendKeys(Password);
		WebElement UserPasswordConf= driver.findElement(By.id("password-confirmation"));
		UserPasswordConf.sendKeys(Password);
		WebElement SignupButton = driver.findElement(By.className("primary"));
		SignupButton.click();
		
	}}

