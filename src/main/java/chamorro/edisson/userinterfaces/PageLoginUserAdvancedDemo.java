package com.sophossolutions.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageLoginUserAdvancedDemo {

	public static final Target INPUT_USER = Target.the("Campo Usuario").locatedBy("name:usernameInOrderPayment");

	public static final Target INPUT_PASSWORD = Target.the("Campo Password").locatedBy("name:passwordInOrderPayment");

	public static final Target BUTTON_LOGIN = Target.the("Boton Login").locatedBy("id:login_btnundefined");

	public static final Target BUTTON_NEXT = Target.the("Boton Next").locatedBy("id:next_btn");

}
