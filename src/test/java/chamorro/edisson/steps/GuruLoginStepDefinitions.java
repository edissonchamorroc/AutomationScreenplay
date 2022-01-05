package chamorro.edisson.steps;

import static chamorro.edisson.userinterfaces.guru.HomePageGuruLogin.BUTTON_LOGIN;
import static chamorro.edisson.userinterfaces.guru.HomePageGuruLogin.USER_ID;
import static chamorro.edisson.userinterfaces.guru.HomePageGuruLogin.USER_PASSWORD;
import static chamorro.edisson.userinterfaces.guru.PageNewCustomerGuru.OPTION_GURU;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import chamorro.edisson.exceptions.GeneralException;
import chamorro.edisson.questions.GetText;
import chamorro.edisson.tasks.guru.LoginUser;
import chamorro.edisson.tasks.guru.RegisterData;
import chamorro.edisson.userinterfaces.guru.PageNewCustomerGuru;
import chamorro.edisson.utilities.Constant;
import chamorro.edisson.utilities.ErrorMessage;
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
