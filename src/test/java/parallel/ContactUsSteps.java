package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.junit.Assert;
import org.testng.Assert;

import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactUsSteps {
	
	private ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());

	@Given("user navigates to Contact Us page")
	public void user_navigates_to_contact_us_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=contact");

	}

	@When("user fills the form given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) {
		
		ExcelReader reader = new ExcelReader();
		try {
			List<Map<String, String>> testData = 
					reader.getData("C:\\Users\\spriy\\Desktop\\Automation.xlsx", sheetName);
			
			String heading = testData.get(rowNumber).get("subjectheading");
			String email = testData.get(rowNumber).get("email");
			String orderRef = testData.get(rowNumber).get("orderref");
			String message = testData.get(rowNumber).get("message");
		
			contactUsPage.fillContactUsForm(heading, email, orderRef, message);
			
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("user clicks on send button")
	public void user_clicks_on_send_button() {
		contactUsPage.clickSend();

	}

	@Then("its show a successful message {string}")
	public void its_show_a_successful_message(String expSuccessMessage) {
		String actualSuccMessag = contactUsPage.getSuccessMessg();
		Assert.assertEquals(actualSuccMessag, expSuccessMessage);

	}

}
