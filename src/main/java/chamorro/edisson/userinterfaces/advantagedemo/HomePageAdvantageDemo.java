package chamorro.edisson.userinterfaces.advantagedemo;

import java.util.HashMap;
import java.util.Map;

import chamorro.edisson.utilities.*;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageAdvantageDemo extends PageObject {

	public static final Target PRODUCT = Target.the("Tipo de producto").locatedBy(Constant.GENERIC_BACK_IMG);

	public static final Target NAME_PRODUCT = Target.the("Nombre especifico del producto")
			.locatedBy(Constant.GENERIC_TEXT);

	public static final Target COLOR = Target.the("Color del producto").locatedBy(Constant.GENERIC_DIV_SHOW_TITLE);

	public static final Target QUANTITY = Target.the("Cantidad de elementos").locatedBy("name:quantity");

	public static final Target ADD_CART = Target.the("Boton adicionar a carrito").locatedBy("name:save_to_cart");

	public static final Target CART_BUTTON = Target.the("Boton carrito").locatedBy("id:menuCart");

	public static final Target CHECKOUT_BUTTON = Target.the("Boton Checkout").locatedBy("id:checkOutButton");
 
	public static Map<String, Target> getTarget() {

		Map<String, Target> lista = new HashMap<String, Target>();

		lista.put("Product", NAME_PRODUCT);

		lista.put("Color", COLOR);

		lista.put("Quantity", QUANTITY);

		lista.put("Add to Card", ADD_CART);

		lista.put("Cart Button", CART_BUTTON);

		return lista;
	}
}
