package steps_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class Steps_EdgeCases {

	@When("user enters a birthdate {string} from a different century")
	public void user_enters_a_birthdate_from_a_different_century(String string) {
		WebElement enterbirthday = Steps_background.driver.findElement(By.id("inputBirthday"));
		enterbirthday.click();
		enterbirthday.clear();
		enterbirthday.sendKeys(string);
	}
}
