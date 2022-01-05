package chamorro.edisson.userinterfaces.yourlogo;

import net.serenitybdd.screenplay.targets.Target;

public class EveningDresses {

	public static final Target RESULT_DRESS = Target.the("Resultado de busqueda")
			.locatedBy("//*[img[@title='Printed Dress']]");
	public static final Target BUTTON_ADD = Target.the("Botón Add").locatedBy("//*[@title='Add to cart']");
	public static final Target QUANTITY = Target.the("Cantidad de vestidos agregados")
			.locatedBy("id:layer_cart_product_quantity");
	


} 
