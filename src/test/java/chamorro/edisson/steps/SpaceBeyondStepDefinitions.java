package chamorro.edisson.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import chamorro.edisson.tasks.ChooseDataTravell;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SpaceBeyondStepDefinitions {

    @When("^Selecciona los datos de viaje$")
    public void seleccionaLosDatosDeViaje(DataTable dataTravell) {

        theActorInTheSpotlight().attemptsTo(ChooseDataTravell.toPlanet( dataTravell));
    }


    @When("^Ingresa los datos de checkout$")
    public void ingresaLosDatosDeCheckout(DataTable dataPay) {

    }

    @Then("^Verifica que se realice el pago$")
    public void verificaQueSeRealiceElPago() {

    }

}
