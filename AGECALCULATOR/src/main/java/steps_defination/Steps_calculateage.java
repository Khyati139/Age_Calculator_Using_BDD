package steps_defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_calculateage {

	@When("user sets the date as per age {string} in the birthdate field")
	public void user_sets_the_date_as_per_age_in_the_birthdate_field(String string) {
		int ageYears = Integer.parseInt(string);


        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.add(java.util.Calendar.YEAR, -ageYears);
        java.util.Date birthDate = cal.getTime();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        String formattedBirthDate = sdf.format(birthDate);

        WebElement dateOfBirthField = Steps_background.driver.findElement(By.id("inputBirthday"));
        dateOfBirthField.clear(); 
        dateOfBirthField.sendKeys(formattedBirthDate);
    }
    

	@Then("Verify that {string} text should be displayed")
	public void verify_that_text_should_be_displayed(String string) {
		String actualString = Steps_background.driver.findElement(By.id("resultDiv")).getText();
		Assert.assertFalse(string.contains(actualString));
	}

	@Then("Verify that {string} error text should be displayed")
	public void verify_that_error_text_should_be_displayed(String string) {
		WebElement errorMessage = Steps_background.driver.findElement(By.id("help_birthday"));
		Assert.assertTrue(errorMessage.isDisplayed());
	}

	@After
	public void user_close_browser() {
		Steps_background.driver.quit();
	}

}
