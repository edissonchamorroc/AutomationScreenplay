package chamorro.edisson.steps;

import chamorro.edisson.tasks.InsertDataTravellSpaceBeyond;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import chamorro.edisson.tasks.ChooseDetailsTravellSpaceBeyond;
import net.serenitybdd.screenplay.actions.Click;
import static chamorro.edisson.userinterfaces.PageSpaceBeyond.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SpaceBeyondStepDefinitions {

    @When("^Selecciona los datos de viaje$")
    public void seleccionaLosDatosDeViaje(DataTable dataTravell) {

        theActorInTheSpotlight().attemptsTo(ChooseDetailsTravellSpaceBeyond.toPlanet(dataTravell));
    }


    @When("^Ingresa los datos de checkout$")
    public void ingresaLosDatosDeCheckout(DataTable dataPay) {
        theActorInTheSpotlight().attemptsTo(InsertDataTravellSpaceBeyond.toPay(dataPay));
    }

    @Then("^Verifica que se realice el pago$")
    public void verificaQueSeRealiceElPago() {

    }

}
