package chamorro.edisson.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import chamorro.edisson.exceptions.GeneralException;
import chamorro.edisson.questions.GetText;
import chamorro.edisson.tasks.Add;
import chamorro.edisson.tasks.Search;
import chamorro.edisson.userinterfaces.EveningDresses;
import chamorro.edisson.userinterfaces.HomePageYourLogo;
import chamorro.edisson.utilities.Constant;
import chamorro.edisson.utilities.ErrorMessage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemoScreenplayStepDefinitions {


	@Before
	public void setup() {
		setTheStage(new OnlineCast());
		theActorCalled(Constant.ACTOR_NAME);
	}


	@Given("^Necesita buscar un vestido$")
	public void necesitoBuscarUnVestido() {
		theActorCalled(Constant.ACTOR_NAME).wasAbleTo(Open.browserOn(new HomePageYourLogo()));
		theActorInTheSpotlight().attemptsTo(Search.dresses()); 
	}  

	@When("^El tipo de vestido es nocturno$")
	public void elTipoDeVestidoEsNocturno() {
		theActorInTheSpotlight().attemptsTo(Add.dressToCart());
	}

	@Then("^Valida que el vestido sea agregado al carrito de compras$")
	public void validoQueElVestidoSeaAgregadoAlCarritoDeCompras() {
		theActorInTheSpotlight()
				.should(seeThat(GetText.ofField(EveningDresses.QUANTITY), equalTo(Constant.QUANTITY_ONE))
						.orComplainWith(GeneralException.class, ErrorMessage.MSG_ERROR_QUANTITY));
	}

}
