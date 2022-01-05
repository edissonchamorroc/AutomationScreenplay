package chamorro.edisson.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static chamorro.edisson.userinterfaces.spacebeyond.PageSpaceBeyond.NAME_PLANET_SELECTED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import chamorro.edisson.exceptions.GeneralException;
import chamorro.edisson.questions.GetText;
import chamorro.edisson.tasks.spacebeyond.ChooseDetailsTravellSpaceBeyond;
import chamorro.edisson.tasks.spacebeyond.InsertDataTravellSpaceBeyond;
import chamorro.edisson.utilities.ErrorMessage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpaceBeyondStepDefinitions {

	@When("^Selecciona los datos de viaje$")
	public void seleccionaLosDatosDeViaje(DataTable dataTravell) {

		theActorInTheSpotlight().attemptsTo(ChooseDetailsTravellSpaceBeyond.toPlanet(dataTravell));
	}

	@When("^Ingresa los datos de checkout$")
	public void ingresaLosDatosDeCheckout(DataTable dataPay) {
		theActorInTheSpotlight().attemptsTo(InsertDataTravellSpaceBeyond.toPay(dataPay));
	}

	@Then("^Verifica que el planeta seleccionado sea \"([^\"]*)\"$")
	public void verificaQueElPlanetaSeleccionadoSea(String namePlanet) {

		theActorInTheSpotlight().should(seeThat(GetText.ofField(NAME_PLANET_SELECTED), equalTo(namePlanet.toUpperCase()))
				.orComplainWith(GeneralException.class, ErrorMessage.MSG_ERROR_TEXT));
	
	}

}
