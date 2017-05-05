package secondScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import secondScenario.SecondPage;

public class FirstPage {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		goToRegister();
		SecondPage.registerDetails();

	}

	private static void goToRegister() {
		try {
			driver.findElement(
					By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"))
					.click();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
