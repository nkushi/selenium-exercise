package firstScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ThirdPage extends FirstPage {

	static void viewReport() {
		try {
			driver.findElement(By.id("self_select_action_22")).click();
			Select dropdown = new Select(driver.findElement(By.id("self_select_action_22")));
			dropdown.selectByValue("View");

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
