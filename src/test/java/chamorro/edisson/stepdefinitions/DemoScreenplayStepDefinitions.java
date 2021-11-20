package com.sophossolutions.steps;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.GetText;
import com.sophossolutions.tasks.Add;
import com.sophossolutions.tasks.Search;
import com.sophossolutions.userinterfaces.EveningDresses;
import com.sophossolutions.userinterfaces.HomePageYourLogo;
import com.sophossolutions.utilities.Constant;
import com.sophossolutions.utilities.ErrorMessage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

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
