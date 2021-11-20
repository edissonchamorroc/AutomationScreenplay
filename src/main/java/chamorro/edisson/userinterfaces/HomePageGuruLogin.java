package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


public class HomePageGuruLogin extends PageObject{
	public static final Target USER_ID = Target.the("Campo userId")
			.locatedBy("name:uid");
	public static final Target USER_PASSWORD = Target.the("Campo password")
			.locatedBy("name:password");
	public static final Target BUTTON_LOGIN = Target.the("Boton Login")
			.locatedBy("name:btnLogin");
  
}  
