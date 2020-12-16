package uni.fmi.cucmber;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.cucmber.models.LoginFormModel;

public class LoginSteps {

	LoginFormModel loginFormModel = new LoginFormModel();

	@Given("^Потребителя отваря приложението$")
	public void потребителя_отваря_приложението() throws Throwable {
		loginFormModel.navigateToMe();
	}

	@When("^Въведе валидно потребителско име$")
	public void въведе_валидно_потребителско_име() throws Throwable {
		loginFormModel.setUsername("Ivan");
	}

	@When("^въведе валдна парола$")
	public void въведе_валдна_парола() throws Throwable {
		loginFormModel.setPassword("password");
	}

	@When("^Кликне на логин бутона$")
	public void кликне_на_логин_бутона() throws Throwable {
		loginFormModel.login();
	}

	@Then("^вижда съобщение за успешно влизане в системата$")
	public void вижда_съобщение_за_успешно_влизане_в_системата() throws Throwable {
		assertEquals("Успешно влизане в системата!", loginFormModel.getMessage());
	}

	@When("^Въведе невалидно потребителско име$")
	public void въведе_невалидно_потребителско_име() throws Throwable {
		loginFormModel.setUsername("Ivan213");
	}

	@When("^въведе невалдна парола$")
	public void въведе_невалдна_парола() throws Throwable {
		loginFormModel.setPassword("wrongPassword");
	}
	
	@Then("^вижда съобщение за липсваща парола$")
	public void вижда_съобщение_за_липсваща_парола() throws Throwable {
		assertEquals("Въведете парола!", loginFormModel.getMessage());
	}

	@Then("^вижда съобщение за липсващо портребителско име$")
	public void вижда_съобщение_за_липсващо_портребителско_име() throws Throwable {
		assertEquals("Въведете потребителско име!", loginFormModel.getMessage());
	}

	@Then("^вижда съобщение за грешно потребителско име$")
	public void вижда_съобщение_за_грешно_потребителско_име() throws Throwable {
		assertEquals("Потребителските данни не са валидни!", loginFormModel.getMessage());
	}

	@Then("^вижда съобщение за грешна парола$")
	public void вижда_съобщение_за_грешна_парола() throws Throwable {
		assertEquals("Потребителските данни не са валидни!", loginFormModel.getMessage());
	}
}
