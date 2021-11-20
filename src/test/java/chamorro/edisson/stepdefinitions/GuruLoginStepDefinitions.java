package com.sophossolutions.steps;

import static com.sophossolutions.userinterfaces.HomePageGuruLogin.BUTTON_LOGIN;
import static com.sophossolutions.userinterfaces.HomePageGuruLogin.USER_ID;
import static com.sophossolutions.userinterfaces.HomePageGuruLogin.USER_PASSWORD;
import static com.sophossolutions.userinterfaces.PageNewCustomerGuru.OPTION_GURU;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.GetText;
import com.sophossolutions.tasks.LoginUser;
import com.sophossolutions.tasks.RegisterData;
import com.sophossolutions.userinterfaces.PageNewCustomerGuru;
import com.sophossolutions.utilities.Constant;
import com.sophossolutions.utilities.ErrorMessage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
public class GuruLoginStepDefinitions {
	
	@Given("^Necesita ingresar en la url \"([^\"]*)\"$")
	public void necesitaIngresarEnLaUrl(String url) {
		theActorCalled(Constant.ACTOR_NAME).wasAbleTo(Open.url(url));
	}
	@Given("^Ingresa usuario \"([^\"]*)\" y password \"([^\"]*)\" en Guru$")
	public void ingresaUsuarioYPasswordEnGuru(String user, String password) {
		
		theActorInTheSpotlight().attemptsTo(LoginUser.login(user, password,USER_ID, USER_PASSWORD,BUTTON_LOGIN));
	}
  
	@Given("^Necesita entrar a la opcion \"([^\"]*)\"$")
	public void necesitaEntrarALaOpcion(String nameOption) {
		
		theActorInTheSpotlight().attemptsTo(Click.on(OPTION_GURU.of(nameOption)));
	}        
 
	@When("^Insertar los datos de Registro$")
	public void insertarLosDatosDeRegistro(DataTable dataUserToRegister) {
		theActorInTheSpotlight()
				.attemptsTo(RegisterData.register(dataUserToRegister.asLists(String.class),PageNewCustomerGuru.getTarget()));
	}

	@Then("^Verificar el mensaje \"([^\"]*)\"$")
	public void verificarElMensaje(String message) {
		theActorInTheSpotlight()
		.should(seeThat(GetText.ofField(PageNewCustomerGuru.TEXTE_REGISTER_SUCCES.of(message)), equalTo(message))
				.orComplainWith(GeneralException.class, ErrorMessage.MSG_ERROR_QUANTITY));
		
	}

}
