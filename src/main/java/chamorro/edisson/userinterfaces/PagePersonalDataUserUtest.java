package chamorro.edisson.userinterfaces;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PagePersonalDataUserUtest {

	public static final Target INPUT_NAME = Target.the("Campo de nombre").locatedBy("id:firstName");
	public static final Target INPUT_LASTNAME = Target.the("Campo de apellido").locatedBy("id:lastName");
	public static final Target INPUT_EMAIL = Target.the("Campo de email").locatedBy("id:email");
	public static final Target BIRTH_MONTH = Target.the("Mes de nacimiento").locatedBy("id:birthMonth");
	public static final Target BIRTH_DAY = Target.the("Dia de nacimiento").locatedBy("id:birthDay");
	public static final Target BIRTH_YEAR = Target.the("Anio de nacimiento").locatedBy("id:birthYear");
	public static final Target INPUT_LANGUAGES = Target.the("Campo de idiomas").locatedBy(Constant.GENERIC_INPUT_TYPE)
			.of("search");
	public static final Target VALUE_LANGUAGES = Target.the("Valor de idiomas")
			.locatedBy("//*[@class='ui-select-highlight' and contains(.,'{0}')]");
	public static final Target BUTTON_NEXT = Target.the("Valor de select").locatedBy(Constant.GENERIC_TEXT)
			.of("Next: Location");

	public static Map<String, Target> getTargetsPersonalUtest() {

		Map<String, Target> lista = new HashMap<String, Target>();

		lista.put("Name", INPUT_NAME);

		lista.put("LastName", INPUT_LASTNAME);

		lista.put("Email", INPUT_EMAIL);

		lista.put("Select month", BIRTH_MONTH);

		lista.put("Select day", BIRTH_DAY);

		lista.put("Select year", BIRTH_YEAR);

		lista.put("Submit", BUTTON_NEXT);

		lista.put("Value", Constant.SELECT_VALUE);

		lista.put("Box Language", INPUT_LANGUAGES);

		lista.put("Value box", VALUE_LANGUAGES);

		return lista;
	}

}
