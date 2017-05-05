package secondScenario;

import org.openqa.selenium.By;


public class SecondPage extends FirstPage {
	
	public static void registerDetails() {
		
		
		try {
			driver.findElement(By.name("firstName")).sendKeys("Donald");
			driver.findElement(By.name("lastName")).sendKeys("Trump");
			driver.findElement(By.name("phone")).sendKeys("1234567");
			driver.findElement(By.name("userName")).sendKeys("Trump@hotmail.com");
			driver.findElement(By.name("address1")).sendKeys("Whitehouse");
			driver.findElement(By.name("email")).sendKeys("Trump@hotmail.com");
			driver.findElement(By.name("password")).sendKeys("smallLoanOfAMillionDollars");
			driver.findElement(By.name("confirmPassword")).sendKeys("smallLoanOfAMillionDollars");
			driver.findElement(By.name("register")).click();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
