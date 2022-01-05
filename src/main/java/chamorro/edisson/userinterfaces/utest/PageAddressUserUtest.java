package chamorro.edisson.userinterfaces.utest;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PageAddressUserUtest {

	public static final Target INPUT_CITY = Target.the("Campo de ciudad").locatedBy("id:city");
	public static final Target INPUT_CODE = Target.the("Campo de codigo posta").locatedBy("id:zip");
	public static final Target INPUT_COUNTRY = Target.the("Campo de pais").locatedBy("//input[@type='search']//ancestor::div[@class='ui-select']");
	public static final Target VALUE_COUNTRY = Target.the("Valor de pais").locatedBy(Constant.GENERIC_TEXT);
	public static final Target BUTTON_NEXT = Target.the("Boton Next").locatedBy(Constant.GENERIC_TEXT)
			.of("Next: Devices"); 

	public static Map<String, Target> getTargetsAddressUtest() {

		Map<String, Target> lista = new HashMap<String, Target>();

		lista.put("Box City", INPUT_CITY);

		lista.put("PostalCode", INPUT_CODE);

		lista.put("Select Country", INPUT_COUNTRY); 

		lista.put("Value", VALUE_COUNTRY);
		
		lista.put("Value box", VALUE_COUNTRY);

		lista.put("Submit", BUTTON_NEXT);

		return lista;
	}

}
