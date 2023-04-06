package Stepdefi;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class exp2_step {

	@Before(value="@functional")
	public void before(Scenario scenario) {
		System.out.println("Test Scenario execution start"+scenario.getName());
		System.out.println("Test Scenario start");
	}

	@After("@functional")
	public void After(Scenario sce) {
		System.out.println("Test Scenario end");
		System.out.println("Test scenario end"+sce.getName());
	}

	@BeforeStep("@functional")
	public void beforestep() {
		System.out.println("Test step start");
	}

	@AfterStep("@functional")
	public void afterstep() {
		System.out.println("Test step end");
	}

	@Given("^User navigate to home page$")
	public void user_navigate_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate to home page");
	}

	@When("^user enter firstname (.+)$")
	public void user_enter_firstname(String firstname) throws Throwable {
		System.out.println("user enter firstname" + firstname);
	}

	@And("^User enter lastname (.+)$")
	public void user_enter_lastname(String lastname) throws Throwable {
		System.out.println("User enter lastname" + lastname);
	}

	@And("^Select gender (.+)$")
	public void select_gender(String gender) throws Throwable {
		System.out.println("Select gender" + gender);
	}

	@Then("^USer click on add button$")
	public void user_click_on_add_button() throws Throwable {
		System.out.println("USer click on add button");
	}

	@And("^User Created sucessfully$")
	public void user_created_sucessfully() throws Throwable {
		System.out.println("User Created sucessfully");
	}

	@Then("^Invalid first name and last name should be displayed$")
	public void invalid_first_name_and_last_name_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Invalid first name and last name should be displayed");
	}

	@Then("^Please enter first and last name$")
	public void please_enter_first_and_last_name() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Please enter first and last name");
	}
}
