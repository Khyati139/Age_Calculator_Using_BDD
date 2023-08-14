package steps_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps_background {

		static WebDriver driver;
	
	@Given("user opened chrome browser and enter url {string}")
	public void user_opened_chrome_browser_and_enter_url(String url) {
		System.setProperty("webdriver.driver.chromedriver", ".//Drivers/chromedriver.exe");
		Steps_background.driver = new ChromeDriver();
		Steps_background.driver.manage().window().maximize();
		Steps_background.driver.get(url);

	}

	@When("user enter {string} in username textbox")
	public void user_enter_in_username_textbox(String string) {
		WebElement entername = Steps_background.driver.findElement(By.id("inputName"));
		entername.click();
		entername.clear();
		entername.sendKeys(string);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		Steps_background.driver.findElement(By.id("submitButton")).click();
		Thread.sleep(4000);

	}

}
