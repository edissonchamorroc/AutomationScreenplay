package chamorro.edisson.userinterfaces;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PageBuyProductAdvancedDemo {

	public static final Target MASTERCARD_OPTION = Target.the("Boton Next").locatedBy("name:masterCredit");

	public static final Target EDIT_OPTION = Target.the("Opcion Editar").locatedBy("//*[@class='edit  ng-scope']");

	public static final Target HOLDER_OPTION = Target.the("Opcion Credit Holder").locatedBy("name:cardholder_name");

	public static final Target CARD_NUMBER_OPTION = Target.the("Opcion Numero de Tarjeta")
			.locatedBy("name:card_number");

	public static final Target MONTH_OPTION = Target.the("Opcion Mes de vencimiento").locatedBy("name:mmListbox");

	public static final Target YEAR_OPTION = Target.the("Opcion Año de vencimiento").locatedBy("name:yyyyListbox");

	public static final Target CVV_OPTION = Target.the("Clave CVV").locatedBy("name:cvv_number");

	public static final Target SUBMIT = Target.the("Clave CVV").locatedBy("id:pay_now_btn_ManualPayment");


	public static Map<String, Target> getTargets() {

		Map<String, Target> lista = new HashMap<String, Target>();

		lista.put("CreditHolder", HOLDER_OPTION);

		lista.put("Card Number", CARD_NUMBER_OPTION);

		lista.put("Select Month Card", MONTH_OPTION);

		lista.put("Select Year Card", YEAR_OPTION);

		lista.put("CVV Number", CVV_OPTION);

		lista.put("Submit", SUBMIT);

		return lista;
	}

}
