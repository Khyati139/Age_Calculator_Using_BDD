package steps_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_UINavigation {

	@When("the user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		WebElement linkElement = Steps_background.driver.findElement(By.cssSelector(
				"img[src='https://cdn.000webhost.com/000webhost/logo/footer-powered-by-000webhost-white2.png']"));
		linkElement.click();
	}

	@Then("the website should navigate to the webhost {string} page")
	public void the_website_should_navigate_to_the_webhost_page(String expectedPageUrl) {
		String actualPageUrl = Steps_background.driver.getCurrentUrl();
		assert actualPageUrl.equals(expectedPageUrl) : "Page navigation mismatch";
	}
}
