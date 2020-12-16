package uni.fmi.cucmber;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.cucmber.models.RegisterFormModel;

public class RegisterSteps {

	RegisterFormModel registerFormModel = new RegisterFormModel();

	@Given("^Потребителя е отворил екрана за регистрация$")
	public void openRegisterScreen() throws Throwable {
		registerFormModel.navigateToMe();
	}

	@When("^Въведе потребилско име: \"([^\"]*)\"$")
	public void addUserName(String username) throws Throwable {
		registerFormModel.setUsername(username);
	}

	@When("^Въведе парола: \"([^\"]*)\"$")
	public void setPass1(String pass1) throws Throwable {
		registerFormModel.setPass1(pass1);
	}

	@When("^Въведе втора парола: \"([^\"]*)\"$")
	public void setPass2(String pass2) throws Throwable {
		registerFormModel.setPass2(pass2);
	}

	@When("^Въведе email: \"([^\"]*)\"$")
	public void setEmail(String email) throws Throwable {
		registerFormModel.setEmail(email);
	}

	@When("^Натисне бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
		registerFormModel.register();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void вижда_съобщение(String message) throws Throwable {
		assertEquals(message, registerFormModel.getMessage());
	}
}
