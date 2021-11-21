package chamorro.edisson.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUtest {

	public static final Target BUTTON_REGISTER = Target.the("Boton de registro")
			.locatedBy("//*[@class='nav navbar-nav']//*[text()='{0}']");

}
