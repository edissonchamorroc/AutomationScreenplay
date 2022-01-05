package chamorro.edisson.steps;

import static chamorro.edisson.tasks.advantagedemo.StoreDataAdvancedDemo.storeData;
import static chamorro.edisson.userinterfaces.advantagedemo.HomePageAdvantageDemo.ADD_CART;
import static chamorro.edisson.userinterfaces.advantagedemo.HomePageAdvantageDemo.CART_BUTTON;
import static chamorro.edisson.userinterfaces.advantagedemo.HomePageAdvantageDemo.CHECKOUT_BUTTON;
import static chamorro.edisson.userinterfaces.advantagedemo.HomePageAdvantageDemo.PRODUCT;
import static chamorro.edisson.userinterfaces.advantagedemo.HomePageAdvantageDemo.getTarget;
import static chamorro.edisson.userinterfaces.advantagedemo.PageBuyProductAdvancedDemo.EDIT_OPTION;
import static chamorro.edisson.userinterfaces.advantagedemo.PageBuyProductAdvancedDemo.MASTERCARD_OPTION;
import static chamorro.edisson.userinterfaces.advantagedemo.PageBuyProductAdvancedDemo.getTargets;
import static chamorro.edisson.userinterfaces.advantagedemo.PageLoginUserAdvancedDemo.BUTTON_LOGIN;
import static chamorro.edisson.userinterfaces.advantagedemo.PageLoginUserAdvancedDemo.BUTTON_NEXT;
import static chamorro.edisson.userinterfaces.advantagedemo.PageLoginUserAdvancedDemo.INPUT_PASSWORD;
import static chamorro.edisson.userinterfaces.advantagedemo.PageLoginUserAdvancedDemo.INPUT_USER;
import static chamorro.edisson.userinterfaces.advantagedemo.PageMyOrdersAdvancedDemo.GENERIC_TARGET;
import static chamorro.edisson.userinterfaces.advantagedemo.PageMyOrdersAdvancedDemo.MENU_USER;
import static chamorro.edisson.userinterfaces.advantagedemo.PageMyOrdersAdvancedDemo.MY_ORDERS;
import static chamorro.edisson.userinterfaces.advantagedemo.PageMyOrdersAdvancedDemo.ORDER_NUMBER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import chamorro.edisson.exceptions.GeneralException;
import chamorro.edisson.questions.GetText;
import chamorro.edisson.tasks.advantagedemo.SelectQualities;
import chamorro.edisson.tasks.guru.LoginUser;
import chamorro.edisson.tasks.guru.RegisterData;
import chamorro.edisson.utilities.ErrorMessage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

public class AdvantageDemoShoppingStepDefinitions {

	@Given("^Necesita entrar a la opcion \"([^\"]*)\" en Advantage$")
	public void necesitaEntrarALaOpcionEnAdvantage(String optionName) {
		theActorInTheSpotlight().attemptsTo(Click.on(PRODUCT.of(optionName)));
	}

	@Given("^Elige el producto de acuerdo a las caracteristicas$")
	public void eligeElProductoDeAcuerdoALasCaracteristicas(DataTable qualitiesData) {
		theActorInTheSpotlight().attemptsTo(
				SelectQualities.selectQualities(qualitiesData.asLists(String.class), getTarget()), Click.on(ADD_CART),
				Click.on(CART_BUTTON));
	}
 
	@Given("^Ingresa usuario \"([^\"]*)\" y password \"([^\"]*)\" en Advantage$")
	public void ingresaUsuarioYPasswordEnAdvantage(String user, String password) {
		theActorInTheSpotlight().attemptsTo(Click.on(CHECKOUT_BUTTON),
				LoginUser.login(user, password, INPUT_USER, INPUT_PASSWORD, BUTTON_LOGIN), Click.on(BUTTON_NEXT));
	}

	@When("^Realiza el pago con datos de tarjeta$")
	public void realizaElPagoConDatosDeTarjeta(DataTable crediCardData) {
		theActorInTheSpotlight().attemptsTo(Click.on(MASTERCARD_OPTION), Click.on(EDIT_OPTION),
				RegisterData.register(crediCardData.asLists(String.class), getTargets()),storeData(ORDER_NUMBER, "Order_Number"), Click.on(MENU_USER),
				Click.on(MY_ORDERS));
	}

	@Then("^Valida la compra con base el numero de orden$")
	public void validaLaCompraConBaseElNumeroDeOrden() {
		theActorInTheSpotlight().should(
				seeThat(GetText.ofField(GENERIC_TARGET.of(theActorInTheSpotlight().recall("Order_Number").toString())),
						equalTo(theActorInTheSpotlight().recall("Order_Number").toString()))
								.orComplainWith(GeneralException.class, ErrorMessage.MSG_ERROR_TEXT));
	}
}
