package chamorro.edisson.userinterfaces;

import chamorro.edisson.utilities.Constant;

import net.serenitybdd.screenplay.targets.Target;

public class PageMyOrdersAdvancedDemo {

	public static final Target ORDER_NUMBER = Target.the("Numero de orden").locatedBy("//*[@id='orderNumberLabel']");

	public static final Target MENU_USER = Target.the("MenU de usuario").locatedBy("id:menuUserLink");

	public static final Target MY_ORDERS = Target.the("Menu de pedidos")
			.locatedBy("//*[@id='loginMiniTitle']/label[2]");

	public static final Target GENERIC_TARGET = Target.the("Target Generico")
			.locatedBy(Constant.GENERIC_LABEL_CONTAINS);

}
