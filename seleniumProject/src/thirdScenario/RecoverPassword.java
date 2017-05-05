package thirdScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecoverPassword {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		signIn();
		recoverPassword();

	}

	private static void signIn() {

		try {
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			driver.findElement(By.id("email")).sendKeys("dave123@hotmail.com");
			driver.findElement(By.id("passwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	private static void recoverPassword() {

		try {
			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a")).click();
			driver.findElement(By.id("email")).sendKeys("dave123@hotmail.com");
			driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")).click();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	
}
