package firstScenario;

import org.openqa.selenium.By;

public class SecondPage extends FirstPage {

	static void goToPerformance() {

		try {
			driver.findElement(By.id("menu_performance_viewMyAppraisals")).click();

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
