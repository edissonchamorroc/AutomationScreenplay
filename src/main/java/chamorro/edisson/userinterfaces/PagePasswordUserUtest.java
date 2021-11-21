package chamorro.edisson.userinterfaces;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PagePasswordUserUtest {

	public static final Target INPUT_PASSWORD = Target.the("Campo de password").locatedBy("id:password");
	public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Campo de password").locatedBy("id:confirmPassword");
	public static final Target CHECKBOX_PRIVACY = Target.the("Checkbox de privacidad").locatedBy("id:privacySetting");
	public static final Target CHECKBOX_TERMS = Target.the("Checbox de condiciones").locatedBy("id:termOfUse");
	public static final Target BUTTON_NEXT = Target.the("Boton Next").locatedBy(Constant.GENERIC_TEXT)
			.of("Complete Setup");

	public static Map<String, Target> getTargetsPasswordUtest() {

		Map<String, Target> lista = new HashMap<String, Target>();

		lista.put("Password", INPUT_PASSWORD);

		lista.put("Confirm Password", INPUT_CONFIRM_PASSWORD);

		lista.put("Submit", BUTTON_NEXT);

		return lista;
	}

}
