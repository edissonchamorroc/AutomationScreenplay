package com.sophossolutions.steps;

import static com.sophossolutions.userinterfaces.HomePageUtest.BUTTON_REGISTER;
import static com.sophossolutions.userinterfaces.PageWelcomeUtest.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static com.sophossolutions.tasks.RegisterUserUtest.registerUserUtest;
import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.GetText;
import com.sophossolutions.utilities.ErrorMessage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

public class UtestUserRegisterStepDefinitions {

	@Given("^Necesita entrar a la opcion \"([^\"]*)\" en Utest$")
	public void necesitaEntrarALaOpcionEnUtest(String nameOption) {
		theActorInTheSpotlight().attemptsTo(Click.on(BUTTON_REGISTER.of(nameOption)));
	}

	@When("^Ingresa los demas datos requeridos para registro$")
	public void ingresaLosDemasDatosRequeridosParaRegistro(DataTable registerData) {
		theActorInTheSpotlight().attemptsTo(registerUserUtest(registerData.asLists(String.class)));

	}

	@Then("^Valida que se haya registrado \"([^\"]*)\"$")
	public void validaQueSeHayaRegistrado(String message) {
		theActorInTheSpotlight().should(seeThat(GetText.ofField(MESSAGE), equalTo(message))
				.orComplainWith(GeneralException.class, ErrorMessage.MSG_ERROR_TEXT));
	}
}
