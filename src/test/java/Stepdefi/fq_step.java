package Stepdefi;

import io.cucumber.java.en.*;

public class fq_step {

	@Given("User navigatesl to login page")
	public void user_navigatesl_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("User navigatesl to login page");
	}

	@When("User entersj username {string}")
	public void user_entersj_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User entersj username "+string);
	}

	@When("User entero password {string}")
	public void user_entero_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User entero password"+string);
	}

	@When("User clickso on submit button")
	public void user_clickso_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Users click on submit");
	}

	@Then("user loggedk in successfully.")
	public void user_loggedk_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("successfully");
	}
}
