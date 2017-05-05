package firstScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://enterprise-demo.orangehrmlive.com/dashboard");

		logIn();
		SecondPage.goToPerformance();
		ThirdPage.viewReport();

	}

	private static void logIn() {

		try {
			driver.findElement(By.id("txtUsername")).sendKeys("linda.anderson\n");
			driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson\n");

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}

