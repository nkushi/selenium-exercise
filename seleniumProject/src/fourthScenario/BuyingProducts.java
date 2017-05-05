package fourthScenario;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BuyingProducts {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		checkoutProduct();
		

	}
	
	private static void checkoutProduct() {
		try {
			
			for (int seconds = 0; seconds < 60; seconds++) {
				if (isElementPresent(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img")))
				break;
				}
				Thread.sleep(1000);
				
			driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[2]/span")).click();
			
			driver.findElement(By.id("color_24")).click();
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
			
			
			for (int seconds = 0; seconds < 60; seconds++) {
				if (isElementPresent(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")))
				break;
				}
				Thread.sleep(1000);
				
			driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
			driver.findElement(By.name("email")).sendKeys("dave123@hotmail.com");
			driver.findElement(By.name("passwd")).sendKeys("dave123");
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
			driver.findElement(By.id("cgv")).click();
			driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
			driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
			driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();

			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}
	
	public static boolean isElementPresent(By locator) {
		try {
		driver.findElement(locator);
		return true;
		} catch (NoSuchElementException e) {
		return false;
		}
		}


}
